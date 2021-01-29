package pl.pabilo8.immersiveintelligence.client.model.multiblock.wooden;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumFacing;
import pl.pabilo8.immersiveintelligence.client.model.ModelIIBase;
import pl.pabilo8.immersiveintelligence.client.tmt.ModelRendererTurbo;

/**
 * Created by Pabilo8 on 2019-06-01.
 * Created using SMP-Toolbox 2.0 (Old stuff, probably considered dead ^^)
 * Thanks to The Flan's Mod Team for the Turbo Model Thingy used in there
 */
public class ModelSkyCrateStation extends ModelIIBase
{
	public ModelRendererTurbo[] pistonDoorModel, backAxleModel, frontAxleModel, cratePusherModel, cratePusherAxleModel, inserterBaseModel, inserterTopModel, inserterTopperModel;
	int textureX = 256;
	int textureY = 128;

	public ModelSkyCrateStation() //Same as Filename
	{
		baseModel = new ModelRendererTurbo[52];
		baseModel[0] = new ModelRendererTurbo(this, 96, 18, textureX, textureY); // Base
		baseModel[1] = new ModelRendererTurbo(this, 20, 18, textureX, textureY); // Piston
		baseModel[2] = new ModelRendererTurbo(this, 156, 78, textureX, textureY); // LegBase
		baseModel[3] = new ModelRendererTurbo(this, 156, 78, textureX, textureY); // LegBase
		baseModel[4] = new ModelRendererTurbo(this, 168, 30, textureX, textureY); // Leg
		baseModel[5] = new ModelRendererTurbo(this, 168, 30, textureX, textureY); // Leg
		baseModel[6] = new ModelRendererTurbo(this, 180, 30, textureX, textureY); // Leg
		baseModel[7] = new ModelRendererTurbo(this, 180, 30, textureX, textureY); // Leg
		baseModel[8] = new ModelRendererTurbo(this, 144, 66, textureX, textureY); // BaseFront
		baseModel[9] = new ModelRendererTurbo(this, 4, 55, textureX, textureY); // Leg
		baseModel[10] = new ModelRendererTurbo(this, 63, 68, textureX, textureY); // Leg
		baseModel[11] = new ModelRendererTurbo(this, 192, 58, textureX, textureY); // MechanicalInput
		baseModel[12] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // MechanicalHolder
		baseModel[13] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // MechanicalHolder
		baseModel[14] = new ModelRendererTurbo(this, 96, 78, textureX, textureY); // MechanicalHolder
		baseModel[15] = new ModelRendererTurbo(this, 78, 16, textureX, textureY); // InserterPlate
		baseModel[16] = new ModelRendererTurbo(this, 130, 78, textureX, textureY); // Inserter
		baseModel[17] = new ModelRendererTurbo(this, 28, 50, textureX, textureY); // InserterAxleBox
		baseModel[18] = new ModelRendererTurbo(this, 116, 102, textureX, textureY); // InserterPlate
		baseModel[19] = new ModelRendererTurbo(this, 130, 78, textureX, textureY); // Inserter
		baseModel[20] = new ModelRendererTurbo(this, 28, 65, textureX, textureY); // LegSidePlate
		baseModel[21] = new ModelRendererTurbo(this, 26, 3, textureX, textureY); // LegMount
		baseModel[22] = new ModelRendererTurbo(this, 26, 9, textureX, textureY); // LegMount
		baseModel[23] = new ModelRendererTurbo(this, 192, 0, textureX, textureY); // BaseBox
		baseModel[24] = new ModelRendererTurbo(this, 120, 0, textureX, textureY); // MechanicalBox
		baseModel[25] = new ModelRendererTurbo(this, 46, 78, textureX, textureY); // AxleBox
		baseModel[26] = new ModelRendererTurbo(this, 0, 102, textureX, textureY); // MechanicalInput
		baseModel[27] = new ModelRendererTurbo(this, 14, 19, textureX, textureY); // Inserter
		baseModel[28] = new ModelRendererTurbo(this, 48, 102, textureX, textureY); // InserterAxleBox
		baseModel[29] = new ModelRendererTurbo(this, 76, 1, textureX, textureY); // Inserter
		baseModel[30] = new ModelRendererTurbo(this, 170, 100, textureX, textureY); // StorageBox
		baseModel[31] = new ModelRendererTurbo(this, 86, 106, textureX, textureY); // Piston
		baseModel[32] = new ModelRendererTurbo(this, 128, 58, textureX, textureY); // Piston
		baseModel[33] = new ModelRendererTurbo(this, 112, 58, textureX, textureY); // Piston
		baseModel[34] = new ModelRendererTurbo(this, 112, 58, textureX, textureY); // Piston
		baseModel[35] = new ModelRendererTurbo(this, 35, 5, textureX, textureY); // BannerRod
		baseModel[36] = new ModelRendererTurbo(this, 52, 21, textureX, textureY); // BannerRod
		baseModel[37] = new ModelRendererTurbo(this, 70, 112, textureX, textureY); // BannerRod
		baseModel[38] = new ModelRendererTurbo(this, 62, 58, textureX, textureY); // MechanicalBox
		baseModel[39] = new ModelRendererTurbo(this, 52, 9, textureX, textureY); // PusherBack
		baseModel[40] = new ModelRendererTurbo(this, 6, 65, textureX, textureY); // GearBase
		baseModel[41] = new ModelRendererTurbo(this, 6, 60, textureX, textureY); // GearBase
		baseModel[42] = new ModelRendererTurbo(this, 7, 31, textureX, textureY); // GearBase
		baseModel[43] = new ModelRendererTurbo(this, 46, 65, textureX, textureY); // BaseFront
		baseModel[44] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // GearBase
		baseModel[45] = new ModelRendererTurbo(this, 11, 0, textureX, textureY); // Hook
		baseModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Hook
		baseModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Hook
		baseModel[48] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Hook
		baseModel[49] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Hook
		baseModel[50] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Hook
		baseModel[51] = new ModelRendererTurbo(this, 112, 58, textureX, textureY); // Piston

		baseModel[0].addBox(0F, 0F, 0F, 16, 8, 32, 0F); // Base
		baseModel[0].setRotationPoint(0F, -8F, -16F);

		baseModel[1].addBox(0F, 0F, 0F, 8, 16, 16, 0F); // Piston
		baseModel[1].setRotationPoint(-16F, -16F, -32F);

		baseModel[2].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // LegBase
		baseModel[2].setRotationPoint(1F, -16F, -10F);

		baseModel[3].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // LegBase
		baseModel[3].setRotationPoint(11F, -16F, -10F);

		baseModel[4].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Leg
		baseModel[4].setRotationPoint(1.5F, -32F, -9.5F);

		baseModel[5].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Leg
		baseModel[5].setRotationPoint(11.5F, -32F, -9.5F);

		baseModel[6].addBox(0F, 0F, 0F, 3, 14, 3, 0F); // Leg
		baseModel[6].setRotationPoint(1.5F, -46F, -9.5F);

		baseModel[7].addBox(0F, 0F, 0F, 3, 14, 3, 0F); // Leg
		baseModel[7].setRotationPoint(11.5F, -46F, -9.5F);

		baseModel[8].addBox(0F, 0F, 0F, 8, 2, 32, 0F); // BaseFront
		baseModel[8].setRotationPoint(4F, -48F, -32F);

		baseModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Leg
		baseModel[9].setRotationPoint(1.5F, -48F, -9.5F);

		baseModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Leg
		baseModel[10].setRotationPoint(11.5F, -48F, -9.5F);

		baseModel[11].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // MechanicalInput
		baseModel[11].setRotationPoint(-16F, -16F, 0F);

		baseModel[12].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // MechanicalHolder
		baseModel[12].setRotationPoint(-14F, -14F, -1F);

		baseModel[13].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // MechanicalHolder
		baseModel[13].setRotationPoint(-14F, -14F, -16F);

		baseModel[14].addBox(0F, 0F, 0F, 10, 10, 14, 0F); // MechanicalHolder
		baseModel[14].setRotationPoint(-13F, -13F, -15F);

		baseModel[15].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // InserterPlate
		baseModel[15].setRotationPoint(12F, -22F, 3F);

		baseModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Inserter
		baseModel[16].setRotationPoint(12F, -24F, 3F);

		baseModel[17].addBox(0F, 0F, 0F, 7, 5, 10, 0F); // InserterAxleBox
		baseModel[17].setRotationPoint(6F, -13F, 3F);

		baseModel[18].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // InserterPlate
		baseModel[18].setRotationPoint(-1F, -22F, 2F);

		baseModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Inserter
		baseModel[19].setRotationPoint(-1F, -24F, 2F);

		baseModel[20].addBox(0F, 0F, 0F, 1, 28, 8, 0F); // LegSidePlate
		baseModel[20].setRotationPoint(-0.5F, -44F, -12F);

		baseModel[21].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // LegMount
		baseModel[21].setRotationPoint(0.5F, -40F, -10.5F);

		baseModel[22].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // LegMount
		baseModel[22].setRotationPoint(0.5F, -23F, -10.5F);

		baseModel[23].addBox(0F, 0F, 0F, 16, 42, 16, 0F); // BaseBox
		baseModel[23].setRotationPoint(16F, -42F, -16F);

		baseModel[24].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MechanicalBox
		baseModel[24].setRotationPoint(16F, -44F, -16F);

		baseModel[25].addBox(0F, 0F, 0F, 8, 8, 16, 0F); // AxleBox
		baseModel[25].setRotationPoint(24F, -16F, 0F);

		baseModel[26].addBox(0F, 0F, 0F, 16, 8, 16, 0F); // MechanicalInput
		baseModel[26].setRotationPoint(16F, -8F, 0F);

		baseModel[27].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Inserter
		baseModel[27].setRotationPoint(0F, -13F, 3F);

		baseModel[28].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // InserterAxleBox
		baseModel[28].setRotationPoint(13F, -13F, 3F);

		baseModel[29].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Inserter
		baseModel[29].setRotationPoint(23F, -13F, 3F);

		baseModel[30].addBox(0F, 0F, 0F, 14, 10, 10, 0F); // StorageBox
		baseModel[30].setRotationPoint(-7F, -26F, 0F);
		baseModel[30].rotateAngleY = 1.15191731F;

		baseModel[31].addBox(0F, 0F, 0F, 7, 2, 16, 0F); // Piston
		baseModel[31].setRotationPoint(-8F, -16F, -32F);

		baseModel[32].addBox(0F, 0F, 0F, 8, 4, 16, 0F); // Piston
		baseModel[32].setRotationPoint(-8F, -4F, -32F);

		baseModel[33].addBox(0F, 0F, 0F, 7, 10, 4, 0F); // Piston
		baseModel[33].setRotationPoint(-8F, -14F, -32F);

		baseModel[34].addBox(0F, 0F, 0F, 7, 10, 4, 0F); // Piston
		baseModel[34].setRotationPoint(-8F, -14F, -20F);

		baseModel[35].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // BannerRod
		baseModel[35].setRotationPoint(19F, -40.5F, -28F);

		baseModel[36].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // BannerRod
		baseModel[36].setRotationPoint(27F, -40.5F, -28F);

		baseModel[37].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // BannerRod
		baseModel[37].setRotationPoint(18F, -41F, -31F);

		baseModel[38].addBox(0F, 0F, 0F, 16, 5, 1, 0F); // MechanicalBox
		baseModel[38].setRotationPoint(16F, -42F, -17F);

		baseModel[39].addBox(0F, 0F, 0F, 3, 3, 9, 0F); // PusherBack
		baseModel[39].setRotationPoint(6.5F, -46F, -9F);

		baseModel[40].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // GearBase
		baseModel[40].setRotationPoint(23F, -38F, 0F);

		baseModel[41].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // GearBase
		baseModel[41].setRotationPoint(23F, -24F, 0F);

		baseModel[42].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // GearBase
		baseModel[42].setRotationPoint(20F, -31F, 0F);

		baseModel[43].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // BaseFront
		baseModel[43].setRotationPoint(14.5F, -46F, -9F);

		baseModel[44].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // GearBase
		baseModel[44].setRotationPoint(15.5F, -45F, 0F);

		baseModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Hook
		baseModel[45].setRotationPoint(6.5F, -42F, -8F);

		baseModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Hook
		baseModel[46].setRotationPoint(6.5F, -43F, -8F);

		baseModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Hook
		baseModel[47].setRotationPoint(8.5F, -43F, -8F);

		baseModel[48].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Hook
		baseModel[48].setRotationPoint(4.5F, -41F, -23F);

		baseModel[49].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Hook
		baseModel[49].setRotationPoint(4.5F, -46F, -23F);

		baseModel[50].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Hook
		baseModel[50].setRotationPoint(10.5F, -46F, -23F);

		baseModel[51].addBox(0F, 0F, 0F, 7, 10, 4, 0F); // Piston
		baseModel[51].setRotationPoint(-8F, -14F, -26F);

		pistonDoorModel = new ModelRendererTurbo[3];
		pistonDoorModel[0] = new ModelRendererTurbo(this, 122, 104, textureX, textureY); // PistonDoor
		pistonDoorModel[1] = new ModelRendererTurbo(this, 216, 120, textureX, textureY); // PistonDoor
		pistonDoorModel[2] = new ModelRendererTurbo(this, 216, 120, textureX, textureY); // PistonDoor

		pistonDoorModel[0].addBox(0F, 0F, 0F, 16, 2, 16, 0F); // PistonDoor
		pistonDoorModel[0].setRotationPoint(-1F, -16F, -32F);

		pistonDoorModel[1].addBox(0F, 0F, 0F, 18, 2, 2, 0F); // PistonDoor
		pistonDoorModel[1].setRotationPoint(-8F, -14F, -28F);

		pistonDoorModel[2].addBox(0F, 0F, 0F, 18, 2, 2, 0F); // PistonDoor
		pistonDoorModel[2].setRotationPoint(-8F, -14F, -22F);

		backAxleModel = new ModelRendererTurbo[6];
		backAxleModel[0] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // InserterAxle1Bottom
		backAxleModel[1] = new ModelRendererTurbo(this, 7, 10, textureX, textureY); // InserterAxle1Top
		backAxleModel[2] = new ModelRendererTurbo(this, 12, 15, textureX, textureY); // InserterAxle1Middle
		backAxleModel[3] = new ModelRendererTurbo(this, 63, 64, textureX, textureY); // InserterAxle1Bottom
		backAxleModel[4] = new ModelRendererTurbo(this, 63, 64, textureX, textureY); // InserterAxle1Top
		backAxleModel[5] = new ModelRendererTurbo(this, 39, 65, textureX, textureY); // InserterAxle1Middle

		backAxleModel[0].addShapeBox(0F, 0.5F, -1.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // InserterAxle1Bottom
		backAxleModel[0].setRotationPoint(14F, 0F, 0F);

		backAxleModel[1].addShapeBox(0F, -1.5F, -1.5F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // InserterAxle1Top
		backAxleModel[1].setRotationPoint(14F, 0F, 0F);

		backAxleModel[2].addBox(0F, -0.5F, -1.5F, 9, 1, 3, 0F); // InserterAxle1Middle
		backAxleModel[2].setRotationPoint(14F, 0F, 0F);

		backAxleModel[3].addShapeBox(0F, 0.5F, -1.5F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // InserterAxle1Bottom
		backAxleModel[3].setRotationPoint(1F, 0F, 0F);

		backAxleModel[4].addShapeBox(0F, -1.5F, -1.5F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // InserterAxle1Top
		backAxleModel[4].setRotationPoint(1F, 0F, 0F);

		backAxleModel[5].addBox(0F, -0.5F, -1.5F, 5, 1, 3, 0F); // InserterAxle1Middle
		backAxleModel[5].setRotationPoint(1F, 0F, 0f);


		frontAxleModel = new ModelRendererTurbo[6];
		frontAxleModel[0] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // InserterAxle1Bottom
		frontAxleModel[1] = new ModelRendererTurbo(this, 7, 10, textureX, textureY); // InserterAxle1Top
		frontAxleModel[2] = new ModelRendererTurbo(this, 12, 15, textureX, textureY); // InserterAxle1Middle
		frontAxleModel[3] = new ModelRendererTurbo(this, 63, 64, textureX, textureY); // InserterAxle1Bottom
		frontAxleModel[4] = new ModelRendererTurbo(this, 39, 65, textureX, textureY); // InserterAxle1Top
		frontAxleModel[5] = new ModelRendererTurbo(this, 2, 6, textureX, textureY); // InserterAxle1Middle

		frontAxleModel[0].addShapeBox(0F, 0.5F, -1.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // InserterAxle1Bottom
		frontAxleModel[0].setRotationPoint(14F, 0, 0F);

		frontAxleModel[1].addShapeBox(0F, -1.5F, -1.5F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // InserterAxle1Top
		frontAxleModel[1].setRotationPoint(14F, 0, 0F);

		frontAxleModel[2].addBox(0F, -0.5F, -1.5F, 9, 1, 3, 0F); // InserterAxle1Middle
		frontAxleModel[2].setRotationPoint(14F, 0, 0F);

		frontAxleModel[3].addShapeBox(0F, 0.5F, -1.5F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // InserterAxle1Bottom
		frontAxleModel[3].setRotationPoint(1F, 0, 0F);

		frontAxleModel[4].addShapeBox(0F, -1.5F, -1.5F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // InserterAxle1Top
		frontAxleModel[4].setRotationPoint(1F, 0, 0f);

		frontAxleModel[5].addBox(0F, -0.5F, -1.5F, 5, 1, 3, 0F); // InserterAxle1Middle
		frontAxleModel[5].setRotationPoint(1F, 0, 0f);


		cratePusherModel = new ModelRendererTurbo[2];
		cratePusherModel[0] = new ModelRendererTurbo(this, 2, 38, textureX, textureY); // PusherRod
		cratePusherModel[1] = new ModelRendererTurbo(this, 6, 27, textureX, textureY); // PusherRod

		cratePusherModel[0].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // PusherRod
		cratePusherModel[0].setRotationPoint(7.5F, -45F, -23F);

		cratePusherModel[1].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // PusherRod
		cratePusherModel[1].setRotationPoint(6.5F, -46F, -24F);


		cratePusherAxleModel = new ModelRendererTurbo[1];
		cratePusherAxleModel[0] = new ModelRendererTurbo(this, 66, 4, textureX, textureY); // PusherAxle

		cratePusherAxleModel[0].addBox(0F, -1F, -1F, 5, 2, 2, 0F); // PusherAxle
		cratePusherAxleModel[0].setRotationPoint(0f, 0f, 0f);

		inserterBaseModel = new ModelRendererTurbo[11];
		inserterBaseModel[0] = new ModelRendererTurbo(this, 78, 86, textureX, textureY); // Inserter
		inserterBaseModel[1] = new ModelRendererTurbo(this, 78, 78, textureX, textureY); // Inserter
		inserterBaseModel[2] = new ModelRendererTurbo(this, 88, 56, textureX, textureY); // Inserter
		inserterBaseModel[3] = new ModelRendererTurbo(this, 82, 64, textureX, textureY); // Inserter
		inserterBaseModel[4] = new ModelRendererTurbo(this, 68, 42, textureX, textureY); // Inserter
		inserterBaseModel[5] = new ModelRendererTurbo(this, 108, 42, textureX, textureY); // Inserter
		inserterBaseModel[6] = new ModelRendererTurbo(this, 88, 42, textureX, textureY); // Inserter
		inserterBaseModel[7] = new ModelRendererTurbo(this, 104, 85, textureX, textureY); // Inserter
		inserterBaseModel[8] = new ModelRendererTurbo(this, 46, 88, textureX, textureY); // Inserter
		inserterBaseModel[9] = new ModelRendererTurbo(this, 46, 78, textureX, textureY); // Inserter
		inserterBaseModel[10] = new ModelRendererTurbo(this, 96, 78, textureX, textureY); // Inserter

		inserterBaseModel[0].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Inserter
		inserterBaseModel[0].setRotationPoint(0F, 0, 0);

		inserterBaseModel[1].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Inserter
		inserterBaseModel[1].setRotationPoint(11F, 0, 0);

		inserterBaseModel[2].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Inserter
		inserterBaseModel[2].setRotationPoint(10F, 1f, 1f);

		inserterBaseModel[3].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Inserter
		inserterBaseModel[3].setRotationPoint(1F, 1f, 1f);

		inserterBaseModel[4].addBox(0F, -4F, -2F, 6, 8, 4, 0F); // Inserter
		inserterBaseModel[4].setRotationPoint(4F, 2f, 2f);

		inserterBaseModel[5].addShapeBox(0F, 4F, -2F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Inserter
		inserterBaseModel[5].setRotationPoint(4F, 2f, 2f);

		inserterBaseModel[6].addShapeBox(0F, 5F, -2F, 6, 1, 4, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Inserter
		inserterBaseModel[6].setRotationPoint(4F, 2f, 2f);

		inserterBaseModel[7].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Inserter
		inserterBaseModel[7].setRotationPoint(3F, 1f, 1f);

		inserterBaseModel[8].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Inserter
		inserterBaseModel[8].setRotationPoint(2F, 0.5f, 0.5f);

		inserterBaseModel[9].addBox(1.5F, -11F, -1.5F, 3, 7, 3, 0F); // Inserter
		inserterBaseModel[9].setRotationPoint(4F, 2f, 2f);

		inserterBaseModel[10].addShapeBox(1.5F, -12F, -1.5F, 3, 1, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Inserter
		inserterBaseModel[10].setRotationPoint(4F, 2f, 2f);


		inserterTopModel = new ModelRendererTurbo[2];
		inserterTopModel[0] = new ModelRendererTurbo(this, 92, 47, textureX, textureY); // Inserter
		inserterTopModel[1] = new ModelRendererTurbo(this, 96, 86, textureX, textureY); // Inserter

		inserterTopModel[0].addBox(2F, -18F, -1F, 2, 6, 2, 0F); // Inserter
		inserterTopModel[0].setRotationPoint(4F, 2f, 2f);

		inserterTopModel[1].addShapeBox(2F, -19F, -1F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Inserter
		inserterTopModel[1].setRotationPoint(4F, 2f, 2f);


		inserterTopperModel = new ModelRendererTurbo[6];
		inserterTopperModel[0] = new ModelRendererTurbo(this, 88, 47, textureX, textureY); // Inserter
		inserterTopperModel[1] = new ModelRendererTurbo(this, 96, 82, textureX, textureY); // Inserter
		inserterTopperModel[2] = new ModelRendererTurbo(this, 88, 88, textureX, textureY); // Inserter
		inserterTopperModel[3] = new ModelRendererTurbo(this, 88, 84, textureX, textureY); // Inserter
		inserterTopperModel[4] = new ModelRendererTurbo(this, 88, 81, textureX, textureY); // Inserter
		inserterTopperModel[5] = new ModelRendererTurbo(this, 88, 78, textureX, textureY); // Inserter

		inserterTopperModel[0].addBox(2.5F, -27F, -0.5F, 1, 8, 1, 0F); // Inserter
		inserterTopperModel[0].setRotationPoint(4F, 2f, 2f);

		inserterTopperModel[1].addBox(2F, -29F, -1F, 2, 2, 2, 0F); // Inserter
		inserterTopperModel[1].setRotationPoint(4F, 2f, 2f);

		inserterTopperModel[2].addBox(4F, -31F, -1F, 1, 2, 2, 0F); // Inserter
		inserterTopperModel[2].setRotationPoint(4F, 2f, 2f);

		inserterTopperModel[3].addBox(1F, -31F, -1F, 1, 2, 2, 0F); // Inserter
		inserterTopperModel[3].setRotationPoint(4F, 2f, 2f);

		inserterTopperModel[4].addShapeBox(4F, -29F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Inserter
		inserterTopperModel[4].setRotationPoint(4F, 2f, 2f);

		inserterTopperModel[5].addShapeBox(1F, -29F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Inserter
		inserterTopperModel[5].setRotationPoint(4F, 2f, 2f);

		parts.put("base", baseModel);

		parts.put("pistonDoor", pistonDoorModel);

		parts.put("backAxle", backAxleModel);
		parts.put("frontAxle", frontAxleModel);
		parts.put("cratePusherAxle", cratePusherAxleModel);

		parts.put("cratePusher", cratePusherModel);

		parts.put("inserterBaseModel", inserterBaseModel);
		parts.put("inserterTopModel", inserterTopModel);
		parts.put("inserterTopperModel", inserterTopperModel);

		flipAll();
	}

	@Override
	public void getBlockRotation(EnumFacing facing, boolean mirrored)
	{
		switch(facing)
		{
			case NORTH:
			{
				if(mirrored)
					GlStateManager.rotate(180F, 0F, 1F, 0F);
				GlStateManager.translate(mirrored?-1: 0, -1f, 0f);
			}
			break;
			case SOUTH:
			{
				if(!mirrored)
					GlStateManager.rotate(180F, 0F, 1F, 0F);
				GlStateManager.translate(mirrored?0: -1f, -1f, mirrored?1: -1f);

			}
			break;
			case EAST:
			{
				GlStateManager.rotate(mirrored?90: 270F, 0F, 1F, 0F);
				GlStateManager.translate(mirrored?-1: 0, -1f, mirrored?1: -1);

			}
			break;
			case WEST:
			{
				GlStateManager.rotate(mirrored?270: 90F, 0F, 1F, 0F);
				GlStateManager.translate(mirrored?0: -1f, -1f, 0);

			}
			break;
		}
	}
}
