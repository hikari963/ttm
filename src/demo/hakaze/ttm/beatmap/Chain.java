package demo.hakaze.ttm.beatmap;

import java.util.HashSet;

public class Chain implements NoteElement{
	private HashSet<Note> notes;
	private Note first;
	private Note last;
	
	public Chain(Note first, Note next){
		notes = new HashSet<>();
		notes.add(first);
		notes.add(next);
		if(first.getMeasure() < next.getMeasure()) {
			this.first = first;
			last = next;
		} else if(first.getMeasure() > next.getMeasure()){
			this.first = next;
			last = first;
		}
		
	}	
	
	public void addNote(Note note){
		notes.add(note);
		if(first.getMeasure() > note.getMeasure()) {
			first = note;			
		}
		if(last.getMeasure() < note.getMeasure()) {
			last = note;			
		}
	}

	@Override
	public double getFirstMeasure() {		
		return first.getMeasure();
	}

	@Override
	public double getLastMeasure() {
		return last.getMeasure();
	}

}
