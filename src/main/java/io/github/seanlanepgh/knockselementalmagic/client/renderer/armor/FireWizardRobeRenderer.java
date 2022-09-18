package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.FireWizardRobeModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceWizardRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireWizardRobeArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWizardRobeArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FireWizardRobeRenderer extends GeoArmorRenderer<FireWizardRobeArmor> {
    public FireWizardRobeRenderer() {
        super(new FireWizardRobeModel());

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