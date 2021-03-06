package com.resonance.model.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.resonance.api.annotations.SummaryProperty;
import com.resonance.model.Model;

public class Specification extends ResourceSupport implements Serializable,Model {

	private static final long serialVersionUID = 1L;
	
	@SummaryProperty
	private String modelName;
	@SummaryProperty
	private String playbackMedia;
	@SummaryProperty
	private String antenna;
	@SummaryProperty
	private int stationPresets;
	@SummaryProperty
	private String tunerBands;
	@SummaryProperty
	private int packagingHeight;
	@SummaryProperty
	private int packagingWidth;
	@SummaryProperty
	private int packagingDepth;
	@SummaryProperty
	private int powerSupply;
	@SummaryProperty
	private int numberOfSpeakers;
	@SummaryProperty
	private String loudspeakerEnhancement;
	@SummaryProperty
	private String speakerTypes;
	@SummaryProperty
	private String soundPower;
	@SummaryProperty
	private int headphone;
	@SummaryProperty
	private String microPhone;
	@SummaryProperty
	private String usb;
	@SummaryProperty
	private String mp3Link;
	@SummaryProperty
	private int rmtctrl;
	@SummaryProperty
	private int userManual;
	@SummaryProperty
	private String warranty;
	@SummaryProperty
	private List<String> playbackModes;
	@SummaryProperty
	private List<String> tuner;
	@SummaryProperty
	private List<String> displayType;
	@SummaryProperty
	private List<String> compatibleWith;
	@SummaryProperty
	private List<String> soundEnc;
	@SummaryProperty
	private List<String> cables;
	@SummaryProperty
	private List<String> others;
	
	
	public Specification(){
		super();
	}

	public Specification(String modelName, String playbackMedia, String antenna, int stationPresets, String tunerBands,
			int packagingHeight, int packagingWidth, int packagingDepth, int powerSupply, int numberOfSpeakers,
			String loudspeakerEnhancement, String speakerTypes, String soundPower, int headphone, String microPhone,
			String usb, String mp3Link, int rmtctrl, int userManual, String warranty, List<String> playbackModes,
			List<String> tuner, List<String> displayType, List<String> compatibleWith, List<String> soundEnc,
			List<String> cables, List<String> others) {
		super();
		this.modelName = modelName;
		this.playbackMedia = playbackMedia;
		this.antenna = antenna;
		this.stationPresets = stationPresets;
		this.tunerBands = tunerBands;
		this.packagingHeight = packagingHeight;
		this.packagingWidth = packagingWidth;
		this.packagingDepth = packagingDepth;
		this.powerSupply = powerSupply;
		this.numberOfSpeakers = numberOfSpeakers;
		this.loudspeakerEnhancement = loudspeakerEnhancement;
		this.speakerTypes = speakerTypes;
		this.soundPower = soundPower;
		this.headphone = headphone;
		this.microPhone = microPhone;
		this.usb = usb;
		this.mp3Link = mp3Link;
		this.rmtctrl = rmtctrl;
		this.userManual = userManual;
		this.warranty = warranty;
		this.playbackModes = playbackModes;
		this.tuner = tuner;
		this.displayType = displayType;
		this.compatibleWith = compatibleWith;
		this.soundEnc = soundEnc;
		this.cables = cables;
		this.others = others;
	}
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getPlaybackMedia() {
		return playbackMedia;
	}

	public void setPlaybackMedia(String playbackMedia) {
		this.playbackMedia = playbackMedia;
	}

	public String getAntenna() {
		return antenna;
	}

	public void setAntenna(String antenna) {
		this.antenna = antenna;
	}

	public int getStationPresets() {
		return stationPresets;
	}

	public void setStationPresets(int stationPresets) {
		this.stationPresets = stationPresets;
	}

	public String getTunerBands() {
		return tunerBands;
	}

	public void setTunerBands(String tunerBands) {
		this.tunerBands = tunerBands;
	}

	public int getPackagingHeight() {
		return packagingHeight;
	}

	public void setPackagingHeight(int packagingHeight) {
		this.packagingHeight = packagingHeight;
	}

	public int getPackagingWidth() {
		return packagingWidth;
	}

	public void setPackagingWidth(int packagingWidth) {
		this.packagingWidth = packagingWidth;
	}

	public int getPackagingDepth() {
		return packagingDepth;
	}

	public void setPackagingDepth(int packagingDepth) {
		this.packagingDepth = packagingDepth;
	}

	public int getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(int powerSupply) {
		this.powerSupply = powerSupply;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getLoudspeakerEnhancement() {
		return loudspeakerEnhancement;
	}

	public void setLoudspeakerEnhancement(String loudspeakerEnhancement) {
		this.loudspeakerEnhancement = loudspeakerEnhancement;
	}

	public String getSpeakerTypes() {
		return speakerTypes;
	}

	public void setSpeakerTypes(String speakerTypes) {
		this.speakerTypes = speakerTypes;
	}

	public String getSoundPower() {
		return soundPower;
	}

	public void setSoundPower(String soundPower) {
		this.soundPower = soundPower;
	}

	public int getHeadphone() {
		return headphone;
	}

	public void setHeadphone(int headphone) {
		this.headphone = headphone;
	}

	public String getMicroPhone() {
		return microPhone;
	}

	public void setMicroPhone(String microPhone) {
		this.microPhone = microPhone;
	}

	public String getUsb() {
		return usb;
	}

	public void setUsb(String usb) {
		this.usb = usb;
	}

	public String getMp3Link() {
		return mp3Link;
	}

	public void setMp3Link(String mp3Link) {
		this.mp3Link = mp3Link;
	}

	public int getRmtctrl() {
		return rmtctrl;
	}

	public void setRmtctrl(int rmtctrl) {
		this.rmtctrl = rmtctrl;
	}

	public int getUserManual() {
		return userManual;
	}

	public void setUserManual(int userManual) {
		this.userManual = userManual;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public List<String> getPlaybackModes() {
		return playbackModes;
	}
	public void setPlaybackModes(List<String> playbackModes) {
		this.playbackModes = playbackModes;
	}
	
	public List<String> getTuner() {
		return tuner;
	}

	public void setTuner(List<String> tuner) {
		this.tuner = tuner;
	}

	public List<String> getDisplayType() {
		return displayType;
	}

	public void setDisplayType(List<String> displayType) {
		this.displayType = displayType;
	}

	public List<String> getCompatibleWith() {
		return compatibleWith;
	}

	public void setCompatibleWith(List<String> compatibleWith) {
		this.compatibleWith = compatibleWith;
	}

	public List<String> getSoundEnc() {
		return soundEnc;
	}

	public void setSoundEnc(List<String> soundEnc) {
		this.soundEnc = soundEnc;
	}

	public List<String> getCables() {
		return cables;
	}

	public void setCables(List<String> cables) {
		this.cables = cables;
	}

	public List<String> getOthers() {
		return others;
	}

	public void setOthers(List<String> others) {
		this.others = others;
	}

	@Override
	public String generateIdFromModel() {
		
		return this.modelName;
	}

	@Override
	public void setUpModelFromId() {
		
	}

}
