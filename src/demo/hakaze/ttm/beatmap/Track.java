package demo.hakaze.ttm.beatmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Track {
	public HashMap<Double, Double> getBpms() {
		return bpms;
	}

	public void setBpms(HashMap<Double, Double> bpms) {
		this.bpms = bpms;
	}

	public ArrayList<NoteElement> getNotes() {
		return notes;
	}

	private HashMap<Double, Double> bpms;
	private ArrayList<NoteElement> notes;
	
	public Track() {
		init();
	}
	
	public Track(Double bpm) {
		init();
		bpms.put(0d, bpm);
	}
	
	private void init() {
		bpms = new HashMap<>();
		notes = new ArrayList<>();
	}
	
	public void addNoteElement(NoteElement element) {
		notes.add(element);
	}
	
	public void addBpm(double measure, double bpm) {
		bpms.put(measure, bpm);
	}
}
