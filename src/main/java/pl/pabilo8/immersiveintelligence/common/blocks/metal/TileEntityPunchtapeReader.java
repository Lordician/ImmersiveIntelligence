package pl.pabilo8.immersiveintelligence.common.blocks.metal;

import blusunrize.immersiveengineering.ImmersiveEngineering;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IDirectionalTile;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IHammerInteraction;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IPlayerInteraction;
import blusunrize.immersiveengineering.common.blocks.IEBlockInterfaces.IRedstoneOutput;
import blusunrize.immersiveengineering.common.blocks.TileEntityIEBase;
import blusunrize.immersiveengineering.common.util.network.MessageNoSpamChatComponents;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import pl.pabilo8.immersiveintelligence.ImmersiveIntelligence;
import pl.pabilo8.immersiveintelligence.api.Utils;
import pl.pabilo8.immersiveintelligence.api.data.DataPacket;
import pl.pabilo8.immersiveintelligence.api.data.IDataConnector;
import pl.pabilo8.immersiveintelligence.api.data.IDataDevice;
import pl.pabilo8.immersiveintelligence.api.data.IDataStorageItem;

/**
 * @author Pabilo8
 * @since 11-06-2019
 */
public class TileEntityPunchtapeReader extends TileEntityIEBase implements ITickable, IRedstoneOutput, IDataDevice, IPlayerInteraction, IHammerInteraction, IDirectionalTile
{
	public boolean toggle = false;
	public int mode = 0;
	EnumFacing facing = EnumFacing.NORTH;

	@Override
	public void update()
	{

	}

	@Override
	public int getWeakRSOutput(IBlockState state, EnumFacing side)
	{
		return 0;
	}

	@Override
	public int getStrongRSOutput(IBlockState state, EnumFacing side)
	{
		return 0;
	}

	@Override
	public boolean canConnectRedstone(IBlockState state, EnumFacing side)
	{
		return false;
	}

	@Override
	public void readCustomNBT(NBTTagCompound nbt, boolean descPacket)
	{
		mode = nbt.getInteger("mode");
		setFacing(EnumFacing.getFront(nbt.getInteger("facing")));
	}

	@Override
	public void writeCustomNBT(NBTTagCompound nbt, boolean descPacket)
	{
		nbt.setInteger("mode", mode);
		nbt.setInteger("facing", facing.ordinal());
	}

	@Override
	public void onReceive(DataPacket packet, EnumFacing side)
	{
		if(mode==0||mode==2)
		{
			ImmersiveEngineering.packetHandler.sendToAllAround(new MessageNoSpamChatComponents(new TextComponentString(packet.toNBT().toString())), Utils.targetPointFromTile(this, 256));
		}
	}

	@Override
	public void onSend()
	{

	}

	@Override
	public boolean hammerUseSide(EnumFacing side, EntityPlayer player, float hitX, float hitY, float hitZ)
	{
		if(player.isSneaking())
		{
			mode += 1;
			if(mode > 2)
				mode = 0;
			ImmersiveEngineering.packetHandler.sendTo(new MessageNoSpamChatComponents(new TextComponentTranslation(ImmersiveIntelligence.proxy.INFO_KEY+"debugger_mode", new TextComponentTranslation(ImmersiveIntelligence.proxy.INFO_KEY+"debugger_mode."+mode))), ((EntityPlayerMP)player));
		}
		return true;
	}

	@Override
	public EnumFacing getFacing()
	{
		return facing;
	}

	@Override
	public void setFacing(EnumFacing facing)
	{
		if(facing.getAxis().isHorizontal())
			this.facing = facing;
		else
			this.facing = EnumFacing.NORTH;
	}

	@Override
	public int getFacingLimitation()
	{
		return 2;
	}

	@Override
	public boolean mirrorFacingOnPlacement(EntityLivingBase placer)
	{
		return true;
	}

	@Override
	public boolean canHammerRotate(EnumFacing side, float hitX, float hitY, float hitZ, EntityLivingBase entity)
	{
		return true;
	}

	@Override
	public boolean canRotate(EnumFacing axis)
	{
		return true;
	}

	@Override
	public boolean interact(EnumFacing side, EntityPlayer player, EnumHand hand, ItemStack heldItem, float hitX, float hitY, float hitZ)
	{
		if(heldItem.getItem() instanceof IDataStorageItem)
		{
			IDataStorageItem storage = (IDataStorageItem)heldItem.getItem();
			DataPacket packet = storage.getStoredData(heldItem);
			IDataConnector conn = Utils.findConnectorFacing(pos, world, facing.getOpposite());
			if(conn!=null)
				conn.sendPacket(packet);
		}
		return false;
	}
}
