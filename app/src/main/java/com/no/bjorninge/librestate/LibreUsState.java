package com.no.bjorninge.librestate;
import com.hg4.oopalgorithm.oopalgorithm.Utils;

public class LibreUsState {
	public byte[] compositeState;
	public byte[] attenuationState;
	
	public String toS() {
		String s = new String();
		s += "{compositeState = ";
		if(compositeState == null) {
			s += "null ";
		} else {
			s+= Utils.byteArrayToHex(compositeState);
		}
		s += " } attenuationState = {";
		if(attenuationState == null) {
			s += "null ";
		} else {
			s+= Utils.byteArrayToHex(attenuationState);
		}
		s += " }";
		return s;
	}
	
}
