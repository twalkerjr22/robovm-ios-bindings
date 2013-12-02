
package org.robovm.bindings.gpgs;

import org.robovm.cocoatouch.foundation.NSError;
import org.robovm.objc.ObjCBlock;
import org.robovm.objc.ObjCBlock.Wrapper;
import org.robovm.rt.bro.annotation.Callback;
import org.robovm.rt.bro.annotation.Marshaler;
import org.robovm.rt.bro.annotation.Pointer;

//typedef void (^GPGAchievementDidIncrementBlock)(BOOL newlyUnlocked, int currentSteps, NSError *error);
@Marshaler(GPGAchievementDidIncrementBlock.Marshaler.class)
public interface GPGAchievementDidIncrementBlock {

	/** Runs this block. */
	void invoke (boolean newlyUnlocked, int currentSteps, NSError error);

	static class Callbacks {
		@Callback
		static void run (ObjCBlock block, boolean newlyUnlocked, int currentSteps, NSError error) {
			((GPGAchievementDidIncrementBlock)block.object()).invoke(newlyUnlocked, currentSteps, error);
		}
	}

	static class Marshaler {
		private static final Wrapper WRAPPER = new Wrapper(Callbacks.class);

		public static @Pointer
		long toNative (Object o) {
			return WRAPPER.toNative(o);
		}

		public static void updateObject (Object o, long handle) {
		}
	}
}
