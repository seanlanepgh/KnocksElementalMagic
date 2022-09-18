package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.EarthSageRobeModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceSageRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.EarthSageRobeArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceSageRobeArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class EarthSageRobeRenderer extends GeoArmorRenderer<EarthSageRobeArmor> {
    public EarthSageRobeRenderer() {
        super(new EarthSageRobeModel());

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