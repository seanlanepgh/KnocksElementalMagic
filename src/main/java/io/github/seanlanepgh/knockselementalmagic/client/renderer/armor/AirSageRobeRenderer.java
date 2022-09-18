package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.AirSageRobeModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceSageRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirSageRobeArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceSageRobeArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AirSageRobeRenderer extends GeoArmorRenderer<AirSageRobeArmor> {
    public AirSageRobeRenderer() {
        super(new AirSageRobeModel());

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