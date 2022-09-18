package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.FireWarlockRobeModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceWarlockRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireWarlockArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceWarlockArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FireWarlockRobeRenderer extends GeoArmorRenderer<FireWarlockArmor> {
    public FireWarlockRobeRenderer() {
        super(new FireWarlockRobeModel());

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