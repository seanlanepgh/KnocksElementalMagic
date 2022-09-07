package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.WizardRobeModel;
import io.github.seanlanepgh.knockselementalmagic.items.armor.IceWizardRobeArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WizardRobeRenderer extends GeoArmorRenderer<IceWizardRobeArmor> {
	public WizardRobeRenderer() {
		super(new WizardRobeModel());

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