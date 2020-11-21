import java.util.TreeSet;
import java.util.Comparator;

public class Main {
	public static void main (String[] args) {

//		CountryComparator countryComparator = new CountryComparator();
//	    	Comparator<Coins> countryComparator =
//      	Comparator.comparing(Coins::getYear).thenComparing(Coins::getCountry);

	    TreeSet<Coins> myCoins = new TreeSet<>(new CountryComparator());
            myCoins.add(new Coins ("Russia", 1964));
            myCoins.add(new Coins ("Spain", 1813));
            myCoins.add(new Coins ("Norway", 1272));
            myCoins.add(new Coins ("Britain", 1941));
            myCoins.add(new Coins ("USA", 1992));


		System.out.println("\t Иван издавна коллекционирует старинные монеты. \n" +
		"Сегодня он наконец решил рассортировать свою маленькую коллекцию в алфавитном порядке стран: ");

		while(!myCoins.isEmpty()) {
			System.out.println(myCoins.pollFirst().getCountry());
		}

	System.out.println("- - - - - - - - - -");

		TreeSet<Integer> coinsCollection = new TreeSet<>();
            coinsCollection.add(1964);
            coinsCollection.add(1813);
            coinsCollection.add(1272);
            coinsCollection.add(1941);
            coinsCollection.add(1992);

        System.out.println("\t После окончания сортировки, монеты рассыпались по полу и " +
        "несколько из них закатились под кровать. \n " +
        "Пока Иван не достанет свои монеты, у него будет лишь часть коллекции: "
        + coinsCollection.subSet(1813, true, 1941, true));

        System.out.println("\t Спустя некоторое время, Иван собрал свои монеты и, сам не заметив, " +
        "рассортировал их в порядке убывания дат: " + coinsCollection.descendingSet());

	}


	public static class CountryComparator implements Comparator<Coins> {

		@Override
		public int compare(Coins o1, Coins o2) {
			return o1.getCountry().compareTo(o2.getCountry());
		}

	}

}