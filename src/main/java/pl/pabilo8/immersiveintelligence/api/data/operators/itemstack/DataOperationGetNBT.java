package pl.pabilo8.immersiveintelligence.api.data.operators.itemstack;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import pl.pabilo8.immersiveintelligence.api.data.DataPacket;
import pl.pabilo8.immersiveintelligence.api.data.operators.DataOperator;
import pl.pabilo8.immersiveintelligence.api.data.types.*;

/**
 * Created by Pabilo8 on 05-07-2019.
 */
public class DataOperationGetNBT extends DataOperator
{
	public DataOperationGetNBT()
	{
		//Gets itemstack NBT in a string form
		name = "get_nbt";
		sign = ">NBT";
		allowedType1 = DataPacketTypeItemStack.class;
		allowedType2 = DataPacketTypeNull.class;
		expectedResult = DataPacketTypeString.class;
	}

	@Override
	public IDataType execute(DataPacket packet, DataPacketTypeExpression data)
	{
		DataPacketTypeItemStack t1;
		int i1;

		t1 = ((DataPacketTypeItemStack)getVarInType(DataPacketTypeItemStack.class, data.getType1(), packet));
		ItemStack stack = t1.value;
		NBTTagCompound tag;
		if(stack.hasTagCompound())
			tag = stack.getTagCompound();
		else
			tag = new NBTTagCompound();


		//Yes
		return new DataPacketTypeString(tag.toString());
	}
}
