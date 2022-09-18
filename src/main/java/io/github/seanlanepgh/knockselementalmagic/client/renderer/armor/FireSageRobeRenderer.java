package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.FireSageRobeModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceSageRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireSageRobeArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceSageRobeArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FireSageRobeRenderer extends GeoArmorRenderer<FireSageRobeArmor> {
    public FireSageRobeRenderer() {
        super(new FireSageRobeModel());

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