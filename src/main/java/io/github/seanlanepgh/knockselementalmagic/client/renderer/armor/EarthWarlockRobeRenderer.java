package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.AirWarlockRobeModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.EarthWarlockRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirWarlockArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.EarthWarlockArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class EarthWarlockRobeRenderer extends GeoArmorRenderer<EarthWarlockArmor> {
    public EarthWarlockRobeRenderer() {
        super(new EarthWarlockRobeModel());

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