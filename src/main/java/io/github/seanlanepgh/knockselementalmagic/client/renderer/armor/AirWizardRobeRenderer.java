package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.AirWizardRobeModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.FireWizardRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirWizardRobeArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireWizardRobeArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AirWizardRobeRenderer extends GeoArmorRenderer<AirWizardRobeArmor> {
    public AirWizardRobeRenderer() {
        super(new AirWizardRobeModel());

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