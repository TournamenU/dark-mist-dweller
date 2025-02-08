
package net.mcreator.skinlessdweller.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.skinlessdweller.entity.ObscuredEntity;
import net.mcreator.skinlessdweller.client.model.animations.RemasrAnimation;
import net.mcreator.skinlessdweller.client.model.ModelRemasr;

public class ObscuredRenderer extends MobRenderer<ObscuredEntity, ModelRemasr<ObscuredEntity>> {
	public ObscuredRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelRemasr.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObscuredEntity entity) {
		return new ResourceLocation("dark_mist_dweller:textures/entities/hungry.png");
	}

	@Override
	protected boolean isShaking(ObscuredEntity entity) {
		return true;
	}

	private static final class AnimatedModel extends ModelRemasr<ObscuredEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ObscuredEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ObscuredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, RemasrAnimation.sniff, ageInTicks, 0.8f);
				this.animate(entity.animationState1, RemasrAnimation.dig, ageInTicks, 1f);
				this.animate(entity.animationState2, RemasrAnimation.dig, ageInTicks, 1.1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ObscuredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
