package pl.pabilo8.immersiveintelligence.common;

import blusunrize.immersiveengineering.api.Lib;
import blusunrize.immersiveengineering.common.items.IEItemInterfaces.IItemDamageableIE;
import blusunrize.immersiveengineering.common.util.IEPotions.IEPotion;
import blusunrize.immersiveengineering.common.util.ItemNBTHelper;
import blusunrize.immersiveengineering.common.util.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import pl.pabilo8.immersiveintelligence.ImmersiveIntelligence;
import pl.pabilo8.immersiveintelligence.api.CorrosionHandler;

/**
 * @author Pabilo8
 * @since 03-03-2020
 */
public class IIPotions
{
	public static Potion suppression, broken_armor, corrosion, infrared_vision, iron_will, well_supplied, concealed, medical_treatment, undergoing_repairs;

	public static void init()
	{
		suppression = new IIPotion("suppression", true, 0xe3bb19, 0, false, 0, true, true);
		suppression.registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, Utils.generateNewUUID().toString(), -0.003921569f, 2);
		suppression.registerPotionAttributeModifier(SharedMonsterAttributes.LUCK, Utils.generateNewUUID().toString(), -0.007843138f, 2);
		suppression.registerPotionAttributeModifier(SharedMonsterAttributes.FOLLOW_RANGE, Utils.generateNewUUID().toString(), -0.007843138f, 2);
		suppression.registerPotionAttributeModifier(SharedMonsterAttributes.FLYING_SPEED, Utils.generateNewUUID().toString(), -0.125, 2);
		suppression.registerPotionAttributeModifier(SharedMonsterAttributes.ATTACK_SPEED, Utils.generateNewUUID().toString(), -0.003921569f, 2);

		broken_armor = new IIPotion("broken_armor", true, 0x755959, 0, false, 1, true, true);
		broken_armor.registerPotionAttributeModifier(SharedMonsterAttributes.ARMOR_TOUGHNESS, Utils.generateNewUUID().toString(), -0.003921569f, 2);

		corrosion = new IIPotion("corrosion", true, 0x567b46, 0, false, 2, true, true)
		{
			@Override
			public void performEffect(EntityLivingBase living, int amplifier)
			{
				living.getArmorInventoryList().forEach(stack -> {
					if(CorrosionHandler.canCorrode(stack))
						stack.damageItem(amplifier, living);
				});
			}
		};
		corrosion.registerPotionAttributeModifier(SharedMonsterAttributes.ARMOR_TOUGHNESS, Utils.generateNewUUID().toString(), -0.003921569f, 2);

		infrared_vision = new IIPotion("infrared_vision", false, 0x7b0000, 0, false, 3, true, true);

		iron_will = new IIPotion("iron_will", false, 0xe2c809, 0, false, 4, true, true);
		iron_will.registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, Utils.generateNewUUID().toString(), 0.003921569f, 1);
		iron_will.registerPotionAttributeModifier(SharedMonsterAttributes.LUCK, Utils.generateNewUUID().toString(), 0.007843138f, 2);

		well_supplied = new IIPotion("well_supplied", false, 0xa49e66, 0, false, 5, true, true);
		concealed = new IIPotion("concealed", false, 0x558858, 0, false, 6, true, true);
		medical_treatment = new IIPotion("medical_treatment", false, 0xe13eb8, 0, false, 7, true, true)
		{
			@Override
			public boolean isReady(int duration, int amplifier)
			{
				return amplifier==0?(duration > 200): (duration > 120);
			}

			@Override
			public void performEffect(EntityLivingBase living, int amplifier)
			{
				if(living.getEntityWorld().getTotalWorldTime()%4==0)
					living.heal((amplifier+1)/4f);
			}
		};
		undergoing_repairs = new IIPotion("undergoing_repairs", false, 0xc0c0c0, 0, false, 8, true, true)
		{
			@Override
			public boolean isReady(int duration, int amplifier)
			{
				return amplifier==0?(duration > 200): (duration > 120);
			}

			@Override
			public void performEffect(EntityLivingBase living, int amplifier)
			{
				if(living.getEntityWorld().getTotalWorldTime()%4==0)
					for(ItemStack stack : living.getEquipmentAndArmor())
					{
						if(stack.getItem() instanceof IItemDamageableIE)
						{
							IItemDamageableIE damageable = (IItemDamageableIE)stack.getItem();
							ItemNBTHelper.setInt(stack, Lib.NBT_DAMAGE, Math.max(damageable.getItemDamageIE(stack)-(amplifier+1), 0));
						}
						else if(stack.isItemStackDamageable()&&stack.getItem().isRepairable())
						{
							stack.setItemDamage(Math.max(stack.getItemDamage()-(amplifier+1), 0));
						}
					}
			}
		};
	}

	public static class IIPotion extends IEPotion
	{
		static ResourceLocation tex = new ResourceLocation(ImmersiveIntelligence.MODID, "textures/gui/potioneffects.png");

		public IIPotion(String name, boolean isBad, int colour, int tick, boolean halveTick, int icon, boolean showInInventory, boolean showInHud)
		{
			super(new ResourceLocation(ImmersiveIntelligence.MODID, name), isBad, colour, tick, halveTick, icon, showInInventory, showInHud);
			this.setPotionName(name);
		}

		@Override
		public Potion setPotionName(String nameIn)
		{
			return super.setPotionName("potion."+ImmersiveIntelligence.MODID+"."+nameIn);
		}

		@Override
		public int getStatusIconIndex()
		{
			//An absolute trick
			int iconindex = super.getStatusIconIndex();
			Minecraft.getMinecraft().getTextureManager().bindTexture(tex);
			return iconindex;
		}

		@Override
		public void renderHUDEffect(PotionEffect effect, Gui gui, int x, int y, float z, float alpha)
		{
			super.renderHUDEffect(effect, gui, x, y, z, alpha);
		}
	}
}
