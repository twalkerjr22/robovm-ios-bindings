
package org.robovm.cocoatouch.messageui;

import org.robovm.rt.bro.ValuedEnum;

public enum MFMailComposeResult implements ValuedEnum {
	MFMailComposeResultCancelled(0), MFMailComposeResultSaved(1), MFMailComposeResultSent(2), MFMailComposeResultFailed(3);

	private final int n;

	private MFMailComposeResult (int n) {
		this.n = n;
	}

	public int value () {
		return n;
	}
}
