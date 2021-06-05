package com.silicateseer.beholdersbookshelves;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class BBStoneSwitchBlock extends Block{
	public static final BooleanProperty POWERED;

	public BBStoneSwitchBlock(Settings settings) {
		super(settings);
		this.setDefaultState(this.stateManager.getDefaultState().with(POWERED, false));
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(POWERED);
	}
	
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if ((Boolean)state.get(POWERED)) {
			return ActionResult.CONSUME;
		} else {
			this.powerOn(state, world, pos);
			this.playClickSound(player, world, pos, true);
			return ActionResult.success(world.isClient);
		}
	}
	
	public void powerOn(BlockState state, World world, BlockPos pos) {
		world.setBlockState(pos, (BlockState)state.with(POWERED, true), 3);
		this.updateNeighbors(state, world, pos);
		world.getBlockTickScheduler().schedule(pos, this, 20);
	}
	
	protected void playClickSound(@Nullable PlayerEntity player, WorldAccess world, BlockPos pos, boolean powered) {
		world.playSound(powered ? player : null, pos, this.getClickSound(powered), SoundCategory.BLOCKS, 0.3F, powered ? 0.6F : 0.5F);
	}
	
	protected SoundEvent getClickSound(boolean powered) {
		return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
	}
	
	public boolean emitsRedstonePower(BlockState state) {
		return true;
	}
	
	public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
		return (Boolean)state.get(POWERED) ? 15 : 0;
	}
	
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if ((Boolean)state.get(POWERED)) {
			world.setBlockState(pos, (BlockState)state.with(POWERED, false), 3);
            this.updateNeighbors(state, world, pos);
            this.playClickSound((PlayerEntity)null, world, pos, false);
		}
	}
	
	private void updateNeighbors(BlockState state, World world, BlockPos pos) {
		world.updateNeighborsAlways(pos, this);
	}
	
	static {
		POWERED = Properties.POWERED;
	}
}
