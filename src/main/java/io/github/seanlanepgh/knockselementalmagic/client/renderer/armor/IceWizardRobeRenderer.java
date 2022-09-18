package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceWizardRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWizardRobeArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class IceWizardRobeRenderer extends GeoArmorRenderer<IceWizardRobeArmor> {
	public IceWizardRobeRenderer() {
		super(new IceWizardRobeModel());

		this.headBone = "armorHead";
		this.bodyBone = "armorBody";
		this.rightArmBone = "armorRightArm";
		this.leftArmBone = "armorLeftArm";
		this.rightLegBone = "armorLeftLeg";
		this.leftLegBone = "armorRightLeg";
		this.rightBootBone = "armorLeftBoot";
		this.leftBootBone = "armorRightBoot";
	}
}