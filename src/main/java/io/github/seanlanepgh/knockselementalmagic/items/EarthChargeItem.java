package io.github.seanlanepgh.knockselementalmagic.items;

import net.minecraft.core.*;
import net.minecraft.sounds.*;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.gameevent.*;

import java.util.*;

public class EarthChargeItem extends Item {
   public EarthChargeItem(Item.Properties p_41202_) {
      super(p_41202_);
   }

   public InteractionResult useOn(UseOnContext p_41204_) {
      Level level = p_41204_.getLevel();
      BlockPos blockpos = p_41204_.getClickedPos();
      BlockState blockstate = level.getBlockState(blockpos);
      boolean flag = false;
      if (!CampfireBlock.canLight(blockstate) && !CandleBlock.canLight(blockstate) && !CandleCakeBlock.canLight(blockstate)) {
         blockpos = blockpos.relative(p_41204_.getClickedFace());
         if (BaseFireBlock.canBePlacedAt(level, blockpos, p_41204_.getHorizontalDirection())) {
            this.playSound(level, blockpos);
            level.setBlockAndUpdate(blockpos, BaseFireBlock.getState(level, blockpos));
            level.gameEvent(p_41204_.getPlayer(), GameEvent.BLOCK_PLACE, blockpos);
            flag = true;
         }
      } else {
         this.playSound(level, blockpos);
         level.setBlockAndUpdate(blockpos, blockstate.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)));
         level.gameEvent(p_41204_.getPlayer(), GameEvent.BLOCK_PLACE, blockpos);
         flag = true;
      }

      if (flag) {
         p_41204_.getItemInHand().shrink(1);
         return InteractionResult.sidedSuccess(level.isClientSide);
      } else {
         return InteractionResult.FAIL;
      }
   }

   private void playSound(Level p_41206_, BlockPos p_41207_) {
      Random random = (Random) p_41206_.getRandom();
      p_41206_.playSound((Player)null, p_41207_, SoundEvents.FIRECHARGE_USE, SoundSource.BLOCKS, 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
   }
}
