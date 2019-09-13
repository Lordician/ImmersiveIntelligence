package pl.pabilo8.immersiveintelligence.api.bullets;

import net.minecraft.util.IStringSerializable;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by Pabilo8 on 30-08-2019.
 */
public class BulletRegistry
{
	public static BulletRegistry INSTANCE = new BulletRegistry();
	HashMap<String, IBulletComponent> registeredComponents = new HashMap<>();
	HashMap<String, IBulletCasingType> registeredCasings = new HashMap<>();

	public boolean registerComponent(IBulletComponent component, String name)
	{
		if(!registeredComponents.containsKey(name))
		{
			registeredComponents.put(name, component);
			return true;
		}
		return false;
	}

	public boolean registerCasing(IBulletCasingType casing, String name)
	{
		if(!registeredCasings.containsKey(name))
		{
			registeredCasings.put(name, casing);
			return true;
		}
		return false;
	}

	@Nullable
	public IBulletComponent getComponent(String name)
	{
		return registeredComponents.get(name);
	}

	@Nullable
	public IBulletCasingType getCasing(String name)
	{
		return registeredCasings.get(name);
	}

	public static enum EnumComponentRole implements IStringSerializable
	{
		SHRAPNEL,
		PIERCING,
		EXPLOSIVE,
		TRACER,
		FLARE,
		CHEMICAL,
		SPECIAL;

		@Override
		public String getName()
		{
			return this.toString().toLowerCase(Locale.ENGLISH);
		}
	}
}
