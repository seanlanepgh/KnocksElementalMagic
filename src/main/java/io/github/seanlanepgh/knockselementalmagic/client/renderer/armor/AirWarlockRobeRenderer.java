package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.AirWarlockRobeModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceWarlockRobeModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirWarlockArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AirWarlockRobeRenderer extends GeoArmorRenderer<AirWarlockArmor> {
public AirWarlockRobeRenderer() {
        super(new AirWarlockRobeModel());

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