package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		int result = o1.getNbHabitant().compareTo(o2.getNbHabitant());
		return result;
	}

}
