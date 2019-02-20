import java.util.*;

/**
 * The test class DoleQueueTest.
 *
 * @author  2007 SC Programming Contest
 * @version (a version number or a date)
 */
public class AllTester extends junit.framework.TestCase
{
// ****************  RationaNumber
	public void testRationaNumber01()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("3", "18");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(7, 22)));
    }

	public void testRationaNumber02()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("", "3");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(1, 3)));

	    rd = new RepeatingDecimalString("", "09");
	    rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(1, 11)));

        rd = new RepeatingDecimalString("", "714285");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(5, 7)));
	}

	public void testRationaNumber03()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("", "6");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(2, 3)));

	    rd = new RepeatingDecimalString("", "142857");
	    rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(1, 7)));

        rd = new RepeatingDecimalString("", "076923");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(1, 13)));

        rd = new RepeatingDecimalString("", "006993");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(1, 11*13)));
	}

	public void testRationaNumber04()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("", "27");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(3, 11)));

	    rd = new RepeatingDecimalString("", "857142");
	    rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(6, 7)));

        rd = new RepeatingDecimalString("", "846153");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(11, 13)));

        rd = new RepeatingDecimalString("0", "63");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(7, 110)));

        rd = new RepeatingDecimalString("06", "36");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(7, 110)));
	}

	public void testRationaNumber05()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("00", "272");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(68, 24975)));

	    rd = new RepeatingDecimalString("12", "1");
	    rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(109, 900)));
	}

	public void testRationaNumber06()
	{
        RepeatingDecimalString rd = new RepeatingDecimalString("12345", "7");
        RationalFraction rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(13889, 112500)));

        rd = new RepeatingDecimalString("0101", "2");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(911, 90000)));
	}

	public void testRationaNumber07()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("0", "21");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(7, 330)));

	    rd = new RepeatingDecimalString("00", "4");
	    rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(1, 225)));

        rd = new RepeatingDecimalString("000", "3");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(1, 3000)));

        rd = new RepeatingDecimalString("1", "2750");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(1159, 9090)));
	}

	public void testRationaNumber08()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("1", "02");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(101, 990)));

	    rd = new RepeatingDecimalString("11", "40");
	    rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(1129, 9900)));

        rd = new RepeatingDecimalString("123", "2");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(1109, 9000)));
	}

	public void testRationaNumber09()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("", "002");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(2, 999)));

        rd = new RepeatingDecimalString("", "294");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(98, 333)));

        rd = new RepeatingDecimalString("", "020304");
	    rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(752, 37037)));

	}

	public void testRationaNumber10()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("", "12345678");
        RationalFraction rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(1371742, 11111111)));

        rd = new RepeatingDecimalString("", "12345678");
        rf = new RationalFraction(rd);
        assertEquals(true, rf.equals(new RationalFraction(1371742, 11111111)));
    }

// ****************  Maya Calender
	public void testTzolkinCalender01()
	{
        HaabCalendar hc = new HaabCalendar(0, "pop", 0);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(1, "imix", 0);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(10, "zac", 0);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(3, "chuen", 0);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(10, "zac", 1995);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(9, "cimi", 2801);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(0, "pop", 1);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(2, "cimi", 1);
        assertEquals(true, ans.equals(result));
    }

	public void testTzolkinCalendar02()
	{
        HaabCalendar hc = new HaabCalendar(7, "pop", 100);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(4, "lamat", 140);
        assertEquals(true, ans.equals(result));
    }

	public void testTzolkinCalendar03()
	{
        HaabCalendar hc = new HaabCalendar(19, "no", 1313);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(1, "chicchan", 1843);
        assertEquals(true, ans.equals(result));
    }

	public void testTzolkinCalendar04()
	{
        HaabCalendar hc = new HaabCalendar(9, "zip", 909);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(10, "mem", 1276);
        assertEquals(true, ans.equals(result));
    }

	public void testTzolkinCalendar05()
	{
        HaabCalendar hc = new HaabCalendar(11, "zotz", 2007);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(12, "manik", 2817);
        assertEquals(true, ans.equals(result));
    
        hc = new HaabCalendar(5, "koyab", 21);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(9, "chuen", 30);
        assertEquals(true, ans.equals(result));
    }

	public void testTzolkinCalendar06()
	{
        HaabCalendar hc = new HaabCalendar(11, "tzec", 1111);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(7, "manik", 1560);
        assertEquals(true, ans.equals(result));
    
        hc = new HaabCalendar(7, "pax", 3021);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(1, "ben", 4242);
        assertEquals(true, ans.equals(result));
}

	public void testTzolkinCalendar07()
	{
        HaabCalendar hc = new HaabCalendar(3, "xul", 3003);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(13, "canac", 4216);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(0, "yoxkin", 1234);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(3, "chuen", 1732);
        assertEquals(true, ans.equals(result));
    }

	public void testTzolkinCalendar08()
	{
        HaabCalendar hc = new HaabCalendar(0, "mol", 2222);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(10, "chuen", 3119);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(19, "zac", 321);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(8, "chicchan", 451);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(10, "ceh", 2005);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(13, "cib", 2815);
        assertEquals(true, ans.equals(result));
    }

    public void testTzolkinCalendar09()
	{
        HaabCalendar hc = new HaabCalendar(19, "mac", 1001);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(13, "chicchan", 1406);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(19, "kankin", 2321);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(1, "chicchan", 3259);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(0, "muan", 2105);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(7, "cimi", 2956);
        assertEquals(true, ans.equals(result));
    }

    public void testTzolkinCalendar10()
	{
        HaabCalendar hc = new HaabCalendar(16, "cumhu", 1666);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(8, "manik", 2340);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(4, "uayet", 777);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(11, "ok", 1092);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(1, "uayet", 4676);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(7, "ik", 6565);
        assertEquals(true, ans.equals(result));
    }

// ****************  Translator
	public void testTranslator01()
	{
       String[] dictionary = {"PROGRAMMING", "LOVE", "COMPUTER", "CONTEST"};
       String[] story = {"I", "ELVO", "OREPMTCU", "ROMNRGMPIGA", "ESNCTTO"};
       
       String[] solution = {"I", "LOVE", "COMPUTER", "PROGRAMMING", "CONTEST"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator02()
	{
       String[] dictionary = {"TEARS", "SEARS", "STARS", "STALE", "STILE", "SMILE", "OF", "THE"};
       String[] story = {"A", "SSERA", "RTASE", "TAESL", "HTE", "STRSA", "SMILE", "OF", "ESTIL"};

       String[] solution = {"A", "SEARS", "TEARS", "STALE", "THE", "STARS", "SMILE", "OF", "STILE"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator03()
	{
       String[] dictionary = {"GRASS", "BE", "CRASS", "CRESS", "TRESS", "TREES", "AND", "TREEN", "GREEN", "OF", "WILL", "FAST"};
       String[] story = {"EB", "CSRES", "OF", "GSSRA", "WLLI", "REENT", "EENGR", "EETRS", "SAFT", "DNA", "SCRAS", "ETRSS"};
       
       String[] solution = {"BE", "CRESS", "OF", "GRASS", "WILL", "TREEN", "GREEN", "TREES", "FAST", "AND", "CRASS", "TRESS"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator04()
	{
       String[] dictionary = {"CAT", "COT", "DOT", "DOG", "OF", "OFF", "BE", "BEE", "BEEN", "BEN", "THERE", "TREE"};
       String[] story = {"ODG", "BE", "TCA", "FO", "DTO", "FOF", "ENB", "TREEH", "OTC", "OF", "OFF", "ERTE", "EBNE", "BE", "FOF", "EBE"};
       
       String[] solution = {"DOG", "BE", "CAT", "OF", "DOT", "OFF", "BEN", "THERE", "COT", "OF", "OFF", "TREE", "BEEN", "BE", "OFF", "BEE"};
       
       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator05()
	{
       String[] dictionary = {"aRMy", "aRMS", "AIMS", "DIms", "Dams", "damE", "nAmE", "NavE", "nAVY"};
       String[] story = {"iAms", "emda", "smda", "raym", "msar", "idsm", "eadm", "yvNa", "nave", "amne"};

       String[] solution = {"AIMS", "damE", "Dams", "aRMy", "aRMS", "DIms", "damE", "nAVY", "NavE", "nAmE"};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator06()
	{
       String[] dictionary = {"AA", "AAB", "BAAB", "BAABC", "CBAABC", "DCBAABC", "DCBAABCD"};
       String[] story = {"AA", "BCACBAD", "ABAB", "DCBAABC", "BAAB","CBAABC", "AAB", 
                         "AA", "DCBAABCD", "AAB",  "CBAABC", "BAABC", "BAABC", "DCBAABCD",};

       String[] solution = {"AA", "DCBAABC", "BAAB", "DCBAABC", "BAAB","CBAABC", "AAB", 
                            "AA", "DCBAABCD", "AAB",  "CBAABC", "BAABC", "BAABC", "DCBAABCD",};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator07()
	{
       String[] dictionary = {"BLUE", "GLUE", "GLUT", "GOUT", "POUT", "PORT", "PART", "PANT", "PINT", "PINK", "three",
                               "MICE", "MITE", "Small", "creature", "MATE", "Win", "at", "chess", "MATS", "with",
                               "Floor", "coverings", "RATS", "the", "and", "ink", "hope", "of", "that", "hat", "due"};
                               
       String[] story = {"A", "lube", "niPT", "Fo", "PkiN", "NKI", "LEgu",
                            "ETh", "GUtl", "MsaLl", "TPou", "GtOU", "Edu",
                            "INw", "tA", "cshes", "atht", "iTmE", "ORPT", "ReAeRuTc", 
                            "TAPR", "atNp", "IcEM", "Nda", "TArs", "TtHa", "OPHE",
                            "MEat", "rFOLo", "INerGoVcs", "and", "TsMA", "ithW", "EThre", "aHt"};

       String[] solution = {"A", "BLUE", "PINT", "of", "PINK", "ink", "GLUE",
                            "the", "GLUT", "Small", "POUT", "GOUT", "due",
                            "Win", "at", "chess", "that", "MITE", "PORT", "creature", 
                            "PART", "PANT", "MICE", "and", "RATS", "that", "hope",
                            "MATE", "Floor", "coverings", "and", "MATS", "with", "three", "hat"};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
          assertEquals(word, solution[index]);
          index++;
        }
    }

	public void testTranslator08()
	{
       String[] dictionary = {"ABCD"};
                               
       String[] story = {"ABCD", "ABDC", "ACBD", "ACDB", "ADBC", "ADCB",
                         "BACD", "BADC", "BCAD", "BCDA", "BDAC", "BDCA",
                         "CABD", "CADB", "CBAD", "CBDA", "CDAB", "CDBA",
                         "DABC", "DACB", "DBAC", "DBCA", "DCBA", "DCAB"};

       String[] solution = {"ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD"};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
           System.out.println(word);
          assertEquals(word, solution[index]);
          index++;
        }
    }

    public void testTranslator09()
	{
       String[] dictionary = {"ABCD"};
                               
       String[] story = {"abcd", "abdC", "acBd", "acDB", "aDbc", "aDcB",
                         "bACd", "bADC", "Bcad", "BcdA", "BdAc", "BdCA",
                         "CAbd", "CAdB", "CBAd", "CBDA"};

       String[] solution = {"ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD", "ABCD", "ABCD",
                            "ABCD", "ABCD", "ABCD", "ABCD"};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
           System.out.println(word);
          assertEquals(word, solution[index]);
          index++;
        }
    }

    public void testTranslator10()
	{
       String[] dictionary = {"if", "static", "do", "for", "while", "public", "private", "double", 
                              "Integer", "String", "int", "class", "BST", "AP", "CS", "void"};
                               
       String[] story = {"fro", "ilwhE", "fI", "BLpUic", "pteriva", "bdoleu", "taTsiC", "OD",
                              "void", "nteIger", "ringSt", "TNi", "laScS", "sTb", "pA", "sc",};

       String[] solution = {"for", "while", "if", "public", "private", "double", "static", "do",
                              "void", "Integer", "String", "int", "class", "BST", "AP", "CS",};

       Translator decoder = new Translator(dictionary);
       story = decoder.decodeMessage(story);
       assertEquals(true, story.length == solution.length);
       int index = 0;
       for(String word : story)
       {
           System.out.println(word);
          assertEquals(word, solution[index]);
          index++;
        }
    }

// ****************  RationalCounter - count on Cantor
	public void testRationalCounter01()
	{
		Fraction f1 = new Fraction(2, 1);
		Fraction ans = RationalCounter.getFraction(3);
	    assertEquals(ans.getNumerator(), 2);
		assertEquals(ans.getDenominator(), 1);

		f1 = new Fraction(2, 4);
		ans = RationalCounter.getFraction(14);
	    assertEquals(ans.getNumerator(), 2);
		assertEquals(ans.getDenominator(), 4);

		f1 = new Fraction(1, 4);
		ans = RationalCounter.getFraction(7);
	    assertEquals(ans.getNumerator(), 1);
		assertEquals(ans.getDenominator(), 4);
    }

	public void testRationalCounter02()
	{
		Fraction f1 = new Fraction(2, 6);
		Fraction ans = RationalCounter.getFraction(27);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(1, 8);
		ans = RationalCounter.getFraction(29);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

	public void testRationalCounter03()
	{
		Fraction f1 = new Fraction(9, 1);
		Fraction ans = RationalCounter.getFraction(37);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(1, 10);
		ans = RationalCounter.getFraction(46);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

	public void testRationalCounter04()
	{
		Fraction f1 = new Fraction(5, 6);
		Fraction ans = RationalCounter.getFraction(50);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(10, 1);
		ans = RationalCounter.getFraction(55);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

	public void testRationalCounter05()
	{
		Fraction f1 = new Fraction(6, 6);
		Fraction ans = RationalCounter.getFraction(61);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(1, 11);
		ans = RationalCounter.getFraction(66);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

	public void testRationalCounter06()
	{
		Fraction f1 = new Fraction(4, 9);
		Fraction ans = RationalCounter.getFraction(70);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(12, 1);
		ans = RationalCounter.getFraction(78);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

	public void testRationalCounter07()
	{
		Fraction f1 = new Fraction(9, 5);
		Fraction ans = RationalCounter.getFraction(83);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(5, 9);
		ans = RationalCounter.getFraction(87);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(4, 10);
		ans = RationalCounter.getFraction(88);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

	public void testRationalCounter08()
	{
		Fraction f1 = new Fraction(10, 6);
		Fraction ans = RationalCounter.getFraction(111);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(10, 12);
		ans = RationalCounter.getFraction(222);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(37, 9);
		ans = RationalCounter.getFraction(999);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

	public void testRationalCounter09()
	{
		Fraction f1 = new Fraction(59, 99);
		Fraction ans = RationalCounter.getFraction(12345);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(604, 1619);
		ans = RationalCounter.getFraction(2468135);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(16773, 27394);
		ans = RationalCounter.getFraction(975312468);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(6282, 38440);
		ans = RationalCounter.getFraction(1000000000);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

	public void testRationalCounter10()
	{
		Fraction f1 = new Fraction(813, 4);
		Fraction ans = RationalCounter.getFraction(333333);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(3977, 1149);
		ans = RationalCounter.getFraction(13131399);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());

		f1 = new Fraction(2844, 1629);
		ans = RationalCounter.getFraction(10000000);
	    assertEquals(ans.getNumerator(), f1.getNumerator());
		assertEquals(ans.getDenominator(), f1.getDenominator());
    }

// ****************  Permalex
	public void testPermalex01()
	{
	    assertEquals(15, Permalex.answer("bacaa"));
	    assertEquals(1, Permalex.answer("abc"));
	    assertEquals(6, Permalex.answer("cba"));
    }

    public void testPermalex02()
	{
	    Permalex temp = new Permalex();
	    assertEquals(1, temp.answer("abcd"));
	    assertEquals(24, temp.answer("dcba"));
    }

	public void testPermalex03()
	{
	    Permalex temp = new Permalex();
	    assertEquals(1, temp.answer("z"));
	    assertEquals(1, temp.answer("1"));
	    assertEquals(1, temp.answer("s"));
	    assertEquals(1, temp.answer("q"));
    }

	public void testPermalex04()
	{
	    Permalex temp = new Permalex();
	    assertEquals(1, temp.answer("22"));
	    assertEquals(1, temp.answer("12"));
	    assertEquals(2, temp.answer("21"));
	    assertEquals(1, temp.answer("11"));
	    assertEquals(1, temp.answer("113"));
	    assertEquals(2, temp.answer("131"));
	    assertEquals(3, temp.answer("311"));
    }

	public void testPermalex05()
	{
	    Permalex temp = new Permalex();
	    assertEquals(1, temp.answer("12345"));
	    assertEquals(5*4*3*2, temp.answer("54321"));
	    assertEquals(24+24+18+2+1+1, temp.answer("35241"));
    }

	public void testPermalex06()
	{
//   e(ehls) => 3*2*1 = 6  + e(hls-e) => 3*2*1*3 = 18 
	    assertEquals(6+18+1, Permalex.answer("heels"));
//   (e)(ehls) => 4*3*2 = 24 (h)(eels) => 4*3*2/2 = 12  
	    assertEquals(12+24+1, Permalex.answer("leehs"));
    }

	public void testPermalex07()
	{
//  (eeiio) - (ee)(iio) => 3 (ei)eio
	    assertEquals(3+1, Permalex.answer("eieio"));
//  (eeiio) - (e)(eiio) =>4*3*2/2 = 12 (ei)eio
	    assertEquals(12+1, Permalex.answer("ieeio"));
    }

	public void testPermalex08()
	{
//  (chloos) - (c)(hloos) => 5*4*3*2/2 = 60  (h)(cloos) => 5*4*3*2/2 = 60
//             (l)(choos) => 5*4*3*2/2 = 60  (o)(chlos) => 5*4*3*2 = 120
//             (sch)(lo)(o)=> 2 (ei)eio
	    assertEquals(300+2+1, Permalex.answer("school"));
//  (chloos) - (c)(hloos) => 5*4*3*2/2 = 60     (h)(cloos) => 5*4*3*2/2 = 60
//             (l)(choos) => 5*4*3*2/2 = 60
//             (o)(c)(hlso) => 4*3*2 = 24       (o)(h)(clso) => 4*3*2 = 24
//             (o)(l)(chso) => 4*3*2 = 24
//             (oo)(c)(hls) => 3*2 = 6          (oo)(h)(cls) => 3*2 = 6
//             (ool)(c)(hs) => 2                (ool)(h)(cs) => 2

	    assertEquals(180+24+24+24+6+6+4+1, Permalex.answer("oolsch"));
    }

	public void testPermalex09()
	{
	    assertEquals(1, Permalex.answer("s"));
	    assertEquals(1, Permalex.answer("as"));
	    assertEquals(2, Permalex.answer("sa"));
    }

	public void testPermalex10()
	{
	    assertEquals(1, Permalex.answer("xxy"));
	    assertEquals(2, Permalex.answer("xyx"));
	    assertEquals(3, Permalex.answer("yxx"));
	    assertEquals(1, Permalex.answer("xxxx"));
    }

// ****************  PascalRealConstan
	public void testPascalRealConstants01()
	{
        assertEquals(true, PascalRealConstants.isValid("1.2"));
        assertEquals(false, PascalRealConstants.isValid("1."));
        assertEquals(false, PascalRealConstants.isValid("E-12"));
        assertEquals(true, PascalRealConstants.isValid("1.0e-55"));
        assertEquals(true, PascalRealConstants.isValid("1e-12"));
        assertEquals(true, PascalRealConstants.isValid("+4.1234567890E-99999"));
        assertEquals(false, PascalRealConstants.isValid("7.6e+12.5"));
        assertEquals(false, PascalRealConstants.isValid("99"));
        assertEquals(false, PascalRealConstants.isValid("6.5E"));
    }

    public void testPascalRealConstants02()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(false, PascalRealConstants.isValid(".2"));
           assertEquals(true, PascalRealConstants.isValid("-1.5E-3333"));
           assertEquals(false, PascalRealConstants.isValid("0.E12"));
           assertEquals(true, PascalRealConstants.isValid("-99999991.099999e-55555555555"));
        }
    }

    public void testPascalRealConstants03()
	{
        for (int x = 0; x < 2; x++)
        {
           assertEquals(false, PascalRealConstants.isValid(".2"));
           assertEquals(false, PascalRealConstants.isValid("12."));
           assertEquals(true, PascalRealConstants.isValid("0.0"));
           assertEquals(true, PascalRealConstants.isValid("9.9"));
           assertEquals(true, PascalRealConstants.isValid("9999999999999999.000000000000000"));
           assertEquals(false, PascalRealConstants.isValid("+12."));
        }
    }

    public void testPascalRealConstants04()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(true, PascalRealConstants.isValid("+0.0"));
           assertEquals(false, PascalRealConstants.isValid("-9999999999999999."));
           assertEquals(false, PascalRealConstants.isValid("12.12-"));
           assertEquals(true, PascalRealConstants.isValid("+0.9"));
           assertEquals(true, PascalRealConstants.isValid("-9.000"));
        }
    }

    public void testPascalRealConstants05()
	{
        for (int x = 0; x < 3; x++)
        {
           assertEquals(true, PascalRealConstants.isValid("90.0e+12"));
           assertEquals(false, PascalRealConstants.isValid("-9.99e-5544444444443210."));
           assertEquals(false, PascalRealConstants.isValid("+1.e12"));
           assertEquals(false, PascalRealConstants.isValid("+41234567890.e+99999123456456.2"));
           assertEquals(true, PascalRealConstants.isValid("7123054652132056106056e+125123456789123456789"));
           assertEquals(false, PascalRealConstants.isValid("62.000005e"));
           assertEquals(false, PascalRealConstants.isValid("62132005e12."));
           assertEquals(false, PascalRealConstants.isValid("621987.123154651235e.5"));
        }
    }

    public void testPascalRealConstants06()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(true, PascalRealConstants.isValid("90.0E+12"));
           assertEquals(false, PascalRealConstants.isValid("-9.99E-5544444444443210."));
           assertEquals(false, PascalRealConstants.isValid("+1.E12"));
           assertEquals(false, PascalRealConstants.isValid("+41234567890.E+99999123456456.2"));
           assertEquals(true, PascalRealConstants.isValid("7123054652132056106056E+125123456789123456789"));
           assertEquals(false, PascalRealConstants.isValid("62.000005E"));
           assertEquals(false, PascalRealConstants.isValid("62132005E12."));
           assertEquals(false, PascalRealConstants.isValid("621987.123154651235E.5"));
        }
    }

    public void testPascalRealConstants07()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(false, PascalRealConstants.isValid("6.5E"));
           assertEquals(false, PascalRealConstants.isValid("621987.123154651235e.5"));
           assertEquals(true, PascalRealConstants.isValid("-99999991.099999e+55555555555"));
           assertEquals(false, PascalRealConstants.isValid("+12."));
           assertEquals(false, PascalRealConstants.isValid("-9999999999999999.56656465484513123131e3123213123132."));
           assertEquals(false, PascalRealConstants.isValid("12.12e-."));
           assertEquals(true, PascalRealConstants.isValid("90.0E+12"));
           assertEquals(false, PascalRealConstants.isValid("-9.99E-5544444444443210."));
           assertEquals(false, PascalRealConstants.isValid("+1.E12"));
           assertEquals(false, PascalRealConstants.isValid("621987.123154651235E.5"));
        }
    }

    public void testPascalRealConstants08()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(false, PascalRealConstants.isValid("E-12"));
           assertEquals(false, PascalRealConstants.isValid("-9.99e-5544444444443210."));
           assertEquals(false, PascalRealConstants.isValid("+1.e12"));
           assertEquals(true, PascalRealConstants.isValid("90.0e+12"));
           assertEquals(true, PascalRealConstants.isValid("1.2"));
           assertEquals(true, PascalRealConstants.isValid("9999999999999999.000000000000000"));
           assertEquals(false, PascalRealConstants.isValid("+41234567890.e+99999123456456.2"));
           assertEquals(false, PascalRealConstants.isValid("62132005e12."));
           assertEquals(true, PascalRealConstants.isValid("1.0e-55"));
           assertEquals(true, PascalRealConstants.isValid("1e-12"));
       }
    }

    public void testPascalRealConstants09()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(true, PascalRealConstants.isValid("-1.5E-3333"));
           assertEquals(false, PascalRealConstants.isValid("+41234567890.E+99999123456456.2"));
           assertEquals(false, PascalRealConstants.isValid("1."));
           assertEquals(true, PascalRealConstants.isValid("7123054652132056106056E+125123456789123456789"));
           assertEquals(false, PascalRealConstants.isValid("12."));
           assertEquals(true, PascalRealConstants.isValid("0.0"));
           assertEquals(false, PascalRealConstants.isValid("62.000005E"));
           assertEquals(false, PascalRealConstants.isValid("62132005E12."));
           assertEquals(true, PascalRealConstants.isValid("+0.0"));
           assertEquals(false, PascalRealConstants.isValid("0.E12"));
       }
    }

    public void testPascalRealConstants10()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(false, PascalRealConstants.isValid(".2"));
           assertEquals(true, PascalRealConstants.isValid("+0.9"));
           assertEquals(true, PascalRealConstants.isValid("9.9"));
           assertEquals(true, PascalRealConstants.isValid("+4.1234567890E-99999"));
           assertEquals(false, PascalRealConstants.isValid("7.6e+12.5"));
           assertEquals(false, PascalRealConstants.isValid("99"));
           assertEquals(true, PascalRealConstants.isValid("7123054652132056106056e+125123456789123456789"));
           assertEquals(false, PascalRealConstants.isValid("62.000005e"));
           assertEquals(true, PascalRealConstants.isValid("-9.000"));
           assertEquals(false, PascalRealConstants.isValid(".2"));
        }
    }

// ****************  Maximun Sum
	public void testMaximumSum01()
	{
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(new Integer(0));
        row0.add(new Integer(-2));
        row0.add(new Integer(-7));
        row0.add(new Integer(0));
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(new Integer(9));
        row1.add(new Integer(2));
        row1.add(new Integer(-6));
        row1.add(new Integer(2));
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(new Integer(-4));
        row2.add(new Integer(1));
        row2.add(new Integer(-4));
        row2.add(new Integer(2));
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.add(new Integer(-1));
        row3.add(new Integer(8));
        row3.add(new Integer(0));
        row3.add(new Integer(-2));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		MaximumSum array1 = new MaximumSum(arr);
	    assertEquals(15, array1.sum());
    }

	public void testMaximumSum02()
	{
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(new Integer(-1));
        row0.add(new Integer(-2));
        row0.add(new Integer(-2));
        row0.add(new Integer(-2));
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(new Integer(-2));
        row1.add(new Integer(-2));
        row1.add(new Integer(-2));
        row1.add(new Integer(-2));
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(new Integer(-2));
        row2.add(new Integer(-2));
        row2.add(new Integer(-2));
        row2.add(new Integer(-2));
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.add(new Integer(-2));
        row3.add(new Integer(-2));
        row3.add(new Integer(-2));
        row3.add(new Integer(-2));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		
        int lastI = -1;
		for (int i = 0; i < arr.size(); i++)
        {
           int lastJ = -1;
		   for (int j = 0; j < arr.get(i).size(); j++)
		   {
		       arr.get(i).set(j, new Integer(-1));
		       if ( lastI == -1 && lastJ == -1)
		           /* first time */;
		       else if ( lastI == -1 /*&& lastJ != -1*/)  // changing element in first row
                  arr.get(0).set(lastJ, new Integer(-2));
		       else if ( lastJ == -1 )  // changing element in first row
                  arr.get(lastI).set(arr.get(i).size()-1, new Integer(-2));
               else   // if ( lastI != -1 && lastJ != -1)  // changing middle element
                  arr.get(lastI).set(lastJ, new Integer(-2));
		       MaximumSum array1 = new MaximumSum(arr);
               assertEquals(array1.sum(), -1);
		       lastJ = j;
		   }
		   lastI = i;
		}
    }

	public void testMaximumSum03()
	{
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(new Integer(-1));
        row0.add(new Integer(-1));
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(new Integer(-1));
        row1.add(new Integer(-1));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);

		arr.get(0).set(0, new Integer(0));
		MaximumSum array1 = new MaximumSum(arr);
	    assertEquals(0, array1.sum());

	    arr.get(0).set(0, new Integer(-1));
		arr.get(0).set(1, new Integer(0));
		array1 = new MaximumSum(arr);
	    assertEquals(0, array1.sum());

	    arr.get(0).set(1, new Integer(0));
		arr.get(1).set(0, new Integer(-1));
		array1 = new MaximumSum(arr);
	    assertEquals(0, array1.sum());

	    arr.get(1).set(0, new Integer(0));
		arr.get(1).set(1, new Integer(-1));
		array1 = new MaximumSum(arr);
	    assertEquals(0, array1.sum());
    }

    public void testMaximumSum04()
    {
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(new Integer(-10));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);

		MaximumSum array1 = new MaximumSum(arr);
	    assertEquals(-10, array1.sum());
	    for (int x = -7; x < 99; x++)
	    {
           arr.get(0).set(0, new Integer(x));
           assertEquals(x, array1.sum());
	   }
    }

    public void testMaximumSum05()
    {
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(new Integer(1));
        row0.add(new Integer(0));
        row0.add(new Integer(-5));
        row0.add(new Integer(11));
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(new Integer(-1));
        row1.add(new Integer(6));
        row1.add(new Integer(2));
        row1.add(new Integer(-11));
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(new Integer(3));
        row2.add(new Integer(7));
        row2.add(new Integer(-4));
        row2.add(new Integer(0));
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.add(new Integer(13));
        row3.add(new Integer(-1));
        row3.add(new Integer(0));
        row3.add(new Integer(1));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);

		MaximumSum array1 = new MaximumSum(arr);
	    assertEquals(28, array1.sum());

		arr.get(3).set(0, new Integer(-15));
		array1 = new MaximumSum(arr);
	    assertEquals(16, array1.sum());

        row0.add(new Integer(6));
        row1.add(new Integer(0));
        row2.add(new Integer(10));
        row3.add(new Integer(2));
        assertEquals(25, array1.sum());

        row0.add(new Integer(-22));
        row1.add(new Integer(-42));
        row2.add(new Integer(20));
        row3.add(new Integer(-22));
        assertEquals(36, array1.sum());
    }

    public void testMaximumSum06()
    {
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        ArrayList<Integer> row4 = new ArrayList<Integer>();
        ArrayList<Integer> row5 = new ArrayList<Integer>();
	    for (int x = 0; x < 6; x++)
	    {
           row0.add(new Integer(0));
           row1.add(new Integer(0));
           row2.add(new Integer(0));
           row3.add(new Integer(0));
           row4.add(new Integer(0));
           row5.add(new Integer(0));
        }
           
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		arr.add(row4);
		arr.add(row5);

		MaximumSum array1 = new MaximumSum(arr);
		row0.set(0, 1);
		row0.set(1, 1);
		row1.set(0, 1);
		row1.set(1, 1);
	    assertEquals(4, array1.sum());

   		row0.set(2, 2);
		row1.set(2, 2);
		row2.set(0, 2);
		row2.set(1, 2);
		row2.set(2, 2);
	    assertEquals(14, array1.sum());

   		row0.set(3, 3);
		row1.set(3, 3);
		row2.set(3, 3);
		row3.set(0, 3);
		row3.set(1, 3);
		row3.set(2, 3);
		row3.set(3, 3);
	    assertEquals(35, array1.sum());

   		row0.set(4, 4);
		row1.set(4, 4);
		row2.set(4, 4);
		row3.set(4, 4);
		row4.set(0, 4);
		row4.set(1, 4);
		row4.set(2, 4);
		row4.set(3, 4);
		row4.set(4, 4);
	    assertEquals(71, array1.sum());

   		row0.set(5, 5);
		row1.set(5, 5);
		row2.set(5, 5);
		row3.set(5, 5);
		row4.set(5, 5);
		row5.set(0, 5);
		row5.set(1, 5);
		row5.set(2, 5);
		row5.set(3, 5);
		row5.set(4, 5);
		row5.set(5, 5);
	    assertEquals(71+55, array1.sum());
    }

    public void testMaximumSum07()
    {
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        ArrayList<Integer> row4 = new ArrayList<Integer>();
        ArrayList<Integer> row5 = new ArrayList<Integer>();
	    for (int x = 0; x < 6; x++)
	    {
           row0.add(new Integer(0));
           row1.add(new Integer(0));
           row2.add(new Integer(0));
           row3.add(new Integer(0));
           row4.add(new Integer(0));
           row5.add(new Integer(0));
        }
           
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		arr.add(row4);
		arr.add(row5);

		MaximumSum array1 = new MaximumSum(arr);
		row5.set(0, 1);
		row5.set(1, 1);
		row4.set(0, 1);
		row4.set(1, 1);
	    assertEquals(4, array1.sum());

   		row5.set(2, 2);
		row4.set(2, 2);
		row3.set(0, 2);
		row3.set(1, 2);
		row3.set(2, 2);
	    assertEquals(14, array1.sum());

   		row5.set(3, 3);
		row4.set(3, 3);
		row3.set(3, 3);
		row2.set(0, 3);
		row2.set(1, 3);
		row2.set(2, 3);
		row2.set(3, 3);
	    assertEquals(35, array1.sum());

   		row5.set(4, 4);
		row4.set(4, 4);
		row3.set(4, 4);
		row2.set(4, 4);
		row1.set(0, 4);
		row1.set(1, 4);
		row1.set(2, 4);
		row1.set(3, 4);
		row1.set(4, 4);
	    assertEquals(71, array1.sum());

   		row5.set(5, 5);
		row4.set(5, 5);
		row3.set(5, 5);
		row2.set(5, 5);
		row1.set(5, 5);
		row0.set(0, 5);
		row0.set(1, 5);
		row0.set(2, 5);
		row0.set(3, 5);
		row0.set(4, 5);
		row0.set(5, 5);
	    assertEquals(71+55, array1.sum());
    }

    public void testMaximumSum08()
    {
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        ArrayList<Integer> row4 = new ArrayList<Integer>();
        ArrayList<Integer> row5 = new ArrayList<Integer>();
	    for (int x = 0; x < 6; x++)
	    {
           row0.add(new Integer(0));
           row1.add(new Integer(0));
           row2.add(new Integer(0));
           row3.add(new Integer(0));
           row4.add(new Integer(0));
           row5.add(new Integer(0));
        }
           
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		arr.add(row4);
		arr.add(row5);

		MaximumSum array1 = new MaximumSum(arr);
		row5.set(5, 1);
		row5.set(4, 1);
		row4.set(5, 1);
		row4.set(4, 1);
	    assertEquals(4, array1.sum());

   		row5.set(3, 2);
		row4.set(3, 2);
		row3.set(5, 2);
		row3.set(4, 2);
		row3.set(3, 2);
	    assertEquals(14, array1.sum());

   		row5.set(2, 3);
		row4.set(2, 3);
		row3.set(2, 3);
		row2.set(5, 3);
		row2.set(4, 3);
		row2.set(3, 3);
		row2.set(2, 3);
	    assertEquals(35, array1.sum());

   		row5.set(1, 4);
		row4.set(1, 4);
		row3.set(1, 4);
		row2.set(1, 4);
		row1.set(5, 4);
		row1.set(4, 4);
		row1.set(3, 4);
		row1.set(2, 4);
		row1.set(1, 4);
	    assertEquals(71, array1.sum());

   		row5.set(0, 5);
		row4.set(0, 5);
		row3.set(0, 5);
		row2.set(0, 5);
		row1.set(0, 5);
		row0.set(0, 5);
		row0.set(1, 5);
		row0.set(2, 5);
		row0.set(3, 5);
		row0.set(4, 5);
		row0.set(5, 5);
	    assertEquals(71+55, array1.sum());
    }

    public void testMaximumSum09()
    {
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        ArrayList<Integer> row4 = new ArrayList<Integer>();
        ArrayList<Integer> row5 = new ArrayList<Integer>();
	    for (int x = 0; x < 6; x++)
	    {
           row0.add(new Integer(0));
           row1.add(new Integer(0));
           row2.add(new Integer(0));
           row3.add(new Integer(0));
           row4.add(new Integer(0));
           row5.add(new Integer(0));
        }
           
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		arr.add(row4);
		arr.add(row5);

		MaximumSum array1 = new MaximumSum(arr);
		row0.set(5, 1);
		row0.set(4, 1);
		row1.set(5, 1);
		row1.set(4, 1);
	    assertEquals(4, array1.sum());

   		row0.set(3, 2);
		row1.set(3, 2);
		row2.set(5, 2);
		row2.set(4, 2);
		row2.set(3, 2);
	    assertEquals(14, array1.sum());

   		row0.set(2, 3);
		row1.set(2, 3);
		row2.set(2, 3);
		row3.set(5, 3);
		row3.set(4, 3);
		row3.set(3, 3);
		row3.set(2, 3);
	    assertEquals(35, array1.sum());

   		row0.set(1, 4);
		row1.set(1, 4);
		row2.set(1, 4);
		row3.set(1, 4);
		row4.set(5, 4);
		row4.set(4, 4);
		row4.set(3, 4);
		row4.set(2, 4);
		row4.set(1, 4);
	    assertEquals(71, array1.sum());

   		row0.set(0, 5);
		row1.set(0, 5);
		row2.set(0, 5);
		row3.set(0, 5);
		row4.set(0, 5);
		row5.set(0, 5);
		row5.set(1, 5);
		row5.set(2, 5);
		row5.set(3, 5);
		row5.set(4, 5);
		row5.set(5, 5);
	    assertEquals(71+55, array1.sum());
    }

    public void testMaximumSum10()
    {
        ArrayList<Integer> row0 = new ArrayList<Integer>();
           
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		MaximumSum array1 = new MaximumSum(arr);

        row0.add(5);
	    assertEquals(5, array1.sum());

        row0.add(-4);
	    assertEquals(5, array1.sum());

	    row0.add(5);
	    assertEquals(6, array1.sum());

        row0.add(-4);
	    assertEquals(6, array1.sum());

	    row0.add(5);
	    assertEquals(7, array1.sum());

        row0.add(4);
	    assertEquals(11, array1.sum());

        row0 = new ArrayList<Integer>();
           
		arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		array1 = new MaximumSum(arr);

        row0.add(5);
        assertEquals(5, array1.sum());

        ArrayList<Integer> row1 = new ArrayList<Integer>();
		arr.add(row1);
        row1.add(-4);
        assertEquals(5, array1.sum());

        ArrayList<Integer> row2 = new ArrayList<Integer>();
		arr.add(row2);
        row2.add(5);
        assertEquals(6, array1.sum());

        ArrayList<Integer> row3 = new ArrayList<Integer>();
		arr.add(row3);
        row3.add(-4);
        assertEquals(6, array1.sum());

        ArrayList<Integer> row4 = new ArrayList<Integer>();
		arr.add(row4);
        row4.add(5);
        assertEquals(7, array1.sum());

        ArrayList<Integer> row5 = new ArrayList<Integer>();
		arr.add(row5);
        row5.add(4);
        assertEquals(11, array1.sum());
    }

// ****************  Dole Queue
	public void testDoleQueue01()
	{
		String[] apps = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		DoleQueue dq = new DoleQueue(apps, 4, 3);
		String[] results = dq.removeApplicants();
		ArrayList<String> CorrectResults = new ArrayList<String>();

		CorrectResults.add("D");
		CorrectResults.add("H");
		CorrectResults.add("I");
		CorrectResults.add("E");
		CorrectResults.add("C");
		CorrectResults.add("A");
		CorrectResults.add("B");
		CorrectResults.add("F");
		CorrectResults.add("J");
		CorrectResults.add("G");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

	public void testDoleQueue02()
	{
		String[] apps = new String[7];
		apps[0] = "zero";
		apps[1] = "first";
		apps[2] = "second";
		apps[3] = "third";
		apps[4] = "fourth";
		apps[5] = "fifth";
		apps[6] = "sixth";
		DoleQueue dq = new DoleQueue(apps, 6, 4);
		String[] results = dq.removeApplicants();

		ArrayList<String> CorrectResults = new ArrayList<String>();
		CorrectResults.add("fifth");
		CorrectResults.add("third");
		CorrectResults.add("sixth");
		CorrectResults.add("first");
		CorrectResults.add("zero");
		CorrectResults.add("fourth");
		CorrectResults.add("second");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

	public void testDoleQueue03()
	{
       String[] apps = new String[5];
       apps[0] = "zero";
       apps[1] = "first";
       apps[2] = "second";
       apps[3] = "third";
       apps[4] = "fourth";
       DoleQueue dq = new DoleQueue(apps, 2, 2);
       String[] results = dq.removeApplicants();

       ArrayList<String> CorrectResults = new ArrayList<String>();
       CorrectResults.add("first");
       CorrectResults.add("third");  //  0  2  4
       CorrectResults.add("fourth");
       CorrectResults.add("zero");
       CorrectResults.add("second");
       for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

	public void testDoleQueue04()
	{
       String[] apps = new String[4];
       apps[0] = "zero";
       apps[1] = "first";
       apps[2] = "second";
       apps[3] = "third";
       DoleQueue dq = new DoleQueue(apps, 1, 1);
       String[] results = dq.removeApplicants();

       ArrayList<String> CorrectResults = new ArrayList<String>();
       CorrectResults.add("zero");
       CorrectResults.add("third");  //  0  2  4
       CorrectResults.add("first");
       CorrectResults.add("second");
       for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }
	public void testDoleQueue05()
	{
		String[] apps = new String[11];
		apps[0] = "zero";
		apps[1] = "first";
		apps[2] = "second";
		apps[3] = "third";
		apps[4] = "fourth";
		apps[5] = "fifth";
		apps[6] = "sixth";
		apps[7] ="seventh";
		apps[8] ="eight";
		apps[9] ="ninth";
		apps[10] = "tenth";
		DoleQueue dq = new DoleQueue(apps, 10, 1);
		String[] results = dq.removeApplicants();

		ArrayList<String> CorrectResults = new ArrayList<String>();
//  0 1 2 3 4 5 6 7 8 9 10
		CorrectResults.add("ninth");
		CorrectResults.add("tenth");
		CorrectResults.add("zero");
		CorrectResults.add("eight");
		CorrectResults.add("third");
		CorrectResults.add("seventh");
		CorrectResults.add("second");
		CorrectResults.add("sixth");
		CorrectResults.add("fourth");
		CorrectResults.add("fifth");
		CorrectResults.add("first");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

    public void testDoleQueue06()
	{
		String[] apps = new String[12];
		apps[0] = "zero";
		apps[1] = "first";
		apps[2] = "second";
		apps[3] = "third";
		apps[4] = "fourth";
		apps[5] = "fifth";
		apps[6] = "sixth";
		apps[7] ="seventh";
		apps[8] ="eight";
		apps[9] ="ninth";
		apps[10] = "tenth";
		apps[11] = "eleven";
		DoleQueue dq = new DoleQueue(apps, 3, 4);
		String[] results = dq.removeApplicants();

		ArrayList<String> CorrectResults = new ArrayList<String>();
//  0 1 2 3 4 5 6 7 8 9 10 11
		CorrectResults.add("second");
		CorrectResults.add("eight");
//  0 1  3 4 5 6 7  9 10 11
		CorrectResults.add("fifth");
		CorrectResults.add("fourth");
//  0 1 3  6 7  9 10 11
		CorrectResults.add("ninth");
		CorrectResults.add("eleven");
//  0 1 3  6 7  10 
		CorrectResults.add("first");
		CorrectResults.add("third");
//  0  6  7  10
		CorrectResults.add("tenth");
		CorrectResults.add("sixth");
//  0 7
		CorrectResults.add("zero");
//  7
		CorrectResults.add("seventh");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

	public void testDoleQueue07()
	{
		String[] apps = new String[15];
		apps[0] = "zero";
		apps[1] = "first";
		apps[2] = "second";
		apps[3] = "third";
		apps[4] = "fourth";
		apps[5] = "fifth";
		apps[6] = "sixth";
		apps[7] ="seventh";
		apps[8] ="eight";
		apps[9] ="ninth";
		apps[10] = "tenth";
		apps[11] = "eleven";
		apps[12] = "twelve";
		apps[13] = "13th";
		apps[14] = "14th";
		DoleQueue dq = new DoleQueue(apps, 10, 7);
		String[] results = dq.removeApplicants();

		ArrayList<String> CorrectResults = new ArrayList<String>();
//  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
		CorrectResults.add("ninth");
		CorrectResults.add("eight");
//  0 1 2 3 4 5 6 7     10 11 12 13 14
		CorrectResults.add("fourth");
		CorrectResults.add("first");
//  0   2 3   5 6 7 10 11 12 13 14
		CorrectResults.add("second");
		CorrectResults.add("seventh");
//  0   3 5 6    10 11 12 13 14
		CorrectResults.add("third");
		CorrectResults.add("twelve");
//  0   5 6 10    11 13 14
		CorrectResults.add("tenth");
		CorrectResults.add("13th");
//  0   5 6    11 14
		CorrectResults.add("sixth");
//  0 5 11 14
		CorrectResults.add("14th");
//  0 5 11
		CorrectResults.add("zero");
		CorrectResults.add("eleven");
		CorrectResults.add("fifth");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

	public void testDoleQueue08()
	{
		String[] apps = new String[12];
		apps[0] = "zero";
		apps[1] = "first";
		apps[2] = "second";
		apps[3] = "third";
		apps[4] = "fourth";
		apps[5] = "fifth";
		apps[6] = "sixth";
		apps[7] ="seventh";
		apps[8] ="eight";
		apps[9] ="ninth";
		apps[10] = "tenth";
		apps[11] = "eleven";
		DoleQueue dq = new DoleQueue(apps, 2, 2);
		String[] results = dq.removeApplicants();

		ArrayList<String> CorrectResults = new ArrayList<String>();
//  0 1 2 3 4 5 6 7 8 9 10 11
		CorrectResults.add("first");
		CorrectResults.add("tenth");
//  0   2 3 4 5 6 7 8 9   11
		CorrectResults.add("third");
		CorrectResults.add("eight");
//  0 2   4 5 6 7   9 11
		CorrectResults.add("fifth");
		CorrectResults.add("sixth");
//  0 2 4    7 9 11
		CorrectResults.add("ninth");
		CorrectResults.add("second");
//  0   4 7   11
		CorrectResults.add("zero");
		CorrectResults.add("eleven");
//  4 7 
		CorrectResults.add("seventh");
		CorrectResults.add("fourth");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

    public void testDoleQueue09()
	{
		String[] apps = new String[20];
		apps[0] = "zero";
		apps[1] = "first";
		apps[2] = "second";
		apps[3] = "third";
		apps[4] = "fourth";
		apps[5] = "fifth";
		apps[6] = "sixth";
		apps[7] = "seventh";
		apps[8] = "eight";
		apps[9] = "ninth";
		apps[10] = "tenth";
		apps[11] = "eleven";
		apps[12] = "twelve";
		apps[13] = "13th";
		apps[14] = "14th";
		apps[15] = "15th";
		apps[16] = "16th";
		apps[17] ="17th";
		apps[18] ="18th";
		apps[19] ="19th";
		DoleQueue dq = new DoleQueue(apps, 4, 8);
		String[] results = dq.removeApplicants();

		ArrayList<String> CorrectResults = new ArrayList<String>();
//  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
		CorrectResults.add("third");
		CorrectResults.add("twelve");
//  0 1 2  4 5 6 7 8 9 10 11  13 14 15 16 17 18 19
		CorrectResults.add("seventh");
		CorrectResults.add("fourth");
//  0 1 2  5 6   8 9 10 11 13 14 15 16 17 18 19
		CorrectResults.add("eleven");
		CorrectResults.add("15th");
//  0 1 2 5 6 8 9 10   13 14   16 17 18 19
		CorrectResults.add("17th");
		CorrectResults.add("second");
//  0 1  5 6 8 9 10 13 14 16   18 19
		CorrectResults.add("first");
		CorrectResults.add("tenth");
//  0   5 6 8 9   13 14 16 18 19
		CorrectResults.add("ninth");
		CorrectResults.add("16th");
//  0 5 6 8    13 14   18 19
		CorrectResults.add("19th");
		CorrectResults.add("18th");
//  0 5 6 8    13 14
		CorrectResults.add("eight");
        CorrectResults.add("13th");
//  0 5 6    14
        CorrectResults.add("sixth");
        CorrectResults.add("14th");
//  0 5
		CorrectResults.add("fifth");
        CorrectResults.add("zero");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

    public void testDoleQueue10()
	{
		String[] apps = new String[30];
		apps[0] = "zero";
		apps[1] = "first";
		apps[2] = "second";
		apps[3] = "third";
		apps[4] = "fourth";
		apps[5] = "fifth";
		apps[6] = "sixth";
		apps[7] ="seventh";
		apps[8] ="eight";
		apps[9] ="ninth";
		apps[10] = "tenth";
		apps[11] = "eleven";
		apps[12] = "twelve";
		apps[13] = "13th";
		apps[14] = "14th";
		apps[15] = "15th";
		apps[16] = "16th";
		apps[17] ="17th";
		apps[18] ="18th";
		apps[19] ="19th";
		apps[20] = "20th";
		apps[21] = "21th";
		apps[22] = "22th";
		apps[23] = "23th";
		apps[24] = "24th";
		apps[25] = "25th";
		apps[26] = "26th";
		apps[27] ="27th";
		apps[28] ="28th";
		apps[29] ="29th";
		DoleQueue dq = new DoleQueue(apps, 5, 5);
		String[] results = dq.removeApplicants();

		ArrayList<String> CorrectResults = new ArrayList<String>();
//  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
		CorrectResults.add("fourth");
		CorrectResults.add("25th");
		CorrectResults.add("ninth");
		CorrectResults.add("20th");
		CorrectResults.add("14th");
		CorrectResults.add("15th");
		CorrectResults.add("21th");
		CorrectResults.add("eight");
		CorrectResults.add("27th");
		CorrectResults.add("second");
		CorrectResults.add("third");
		CorrectResults.add("26th");
		CorrectResults.add("eleven");
		CorrectResults.add("18th");
		CorrectResults.add("19th");
		CorrectResults.add("tenth");
		CorrectResults.add("29th");
		CorrectResults.add("zero");
		CorrectResults.add("twelve");
		CorrectResults.add("17th");
		CorrectResults.add("24th");
		CorrectResults.add("fifth");
		CorrectResults.add("13th");
		CorrectResults.add("16th");
		CorrectResults.add("sixth");
        CorrectResults.add("23th");
        CorrectResults.add("seventh");
        CorrectResults.add("22th");
		CorrectResults.add("28th");
        CorrectResults.add("first");
		for(int j = 0; j < CorrectResults.size(); j++)
           assertEquals(CorrectResults.get(j), results[j]);
    }

// ****************  War
	public void testGameOfWar01()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    	    Card card1 = new Card("2", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card[] handA = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("you", hand1);
    
    		card1 = new Card("5", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("me", hand2);
    		Player[] ps = {p1, p2};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("me", game.findGameWinner());
        }
	}
	
	public void testGameOfWar02()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("2", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card[] handA = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("5", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		Card card6 = new Card("3", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("7", "spade");
    		card2 = new Card("8", "club");
    		card3 = new Card("king", "diamond");
    		card4 = new Card("10", "heart");
    		card5 = new Card("ace", "spade");
    		Card[] handC = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		Player[] ps = {p1, p3, p2};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }

	    for (int kjasdkljdf = 0; kjasdkljdf < 7; kjasdkljdf++)
	    {
    		Card card1 = new Card("2", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card[] handA = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("5", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		Card card6 = new Card("3", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("7", "spade");
    		card2 = new Card("8", "club");
    		card3 = new Card("king", "diamond");
    		card4 = new Card("10", "heart");
    		card5 = new Card("jack", "spade");
    		Card[] handC = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);

    		Player[] ps = {p1, p3, p2};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals(p3.getName(), game.findGameWinner());
        }
    }

	public void testGameOfWar03()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("5", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card card6 = new Card("jack", "diamond");
    		Card card7 = new Card("3", "diamond");
    		Card[] handA = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("4", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("9", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		card6 = new Card("jack", "heart");
    		card7 = new Card("2", "diamond");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("7", "spade");
    		card2 = new Card("8", "club");
    		card3 = new Card("king", "diamond");
    		card4 = new Card("10", "heart");
    		card5 = new Card("jack", "spade");
    		card6 = new Card("ace", "diamond");
    		card7 = new Card("4", "diamond");
    		Card[] handC = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		Player[] ps = {p3, p2, p1};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }

    	for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("5", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card card6 = new Card("jack", "diamond");
    		Card card7 = new Card("3", "diamond");
    		Card[] handA = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("4", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("9", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		card6 = new Card("jack", "heart");
    		card7 = new Card("2", "diamond");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("7", "spade");
    		card2 = new Card("8", "club");
    		card3 = new Card("king", "diamond");
    		card4 = new Card("10", "heart");
    		card5 = new Card("jack", "spade");
    		card6 = new Card("ace", "diamond");
    		card7 = new Card("4", "diamond");
    		Card[] handC = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		Player[] ps = {p3, p2, p1};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }
}

	public void testGameOfWar04()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("3", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card card6 = new Card("jack", "diamond");
    		Card card7 = new Card("3", "diamond");
    		Card[] handA = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("2", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("9", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		card6 = new Card("jack", "heart");
    		card7 = new Card("2", "diamond");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("2", "spade");
    		card2 = new Card("8", "club");
    		card3 = new Card("king", "diamond");
    		card4 = new Card("10", "heart");
    		card5 = new Card("jack", "spade");
    		card6 = new Card("ace", "diamond");
    		card7 = new Card("4", "diamond");
    		Card[] handC = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		Player[] ps = {p2, p1, p3};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }

    	for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("3", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card card6 = new Card("jack", "diamond");
    		Card card7 = new Card("3", "diamond");
    		Card[] handA = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("2", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("9", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		card6 = new Card("jack", "heart");
    		card7 = new Card("2", "diamond");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("2", "spade");
    		card2 = new Card("8", "club");
    		card3 = new Card("king", "diamond");
    		card4 = new Card("10", "heart");
    		card5 = new Card("jack", "spade");
    		card6 = new Card("ace", "diamond");
    		card7 = new Card("4", "diamond");
    		Card[] handC = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		Player[] ps = {p2, p1, p3};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }
   }

	public void testGameOfWar05()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("5", "spade");
    		Card card2 = new Card("ace", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("king", "heart");
    		Card card5 = new Card("4", "spade");
    		Card card6 = new Card("10", "diamond");
    		Card card7 = new Card("3", "diamond");
    		Card[] handA = {card1, card2, card3, card4, card5, card6, card7};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("5", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("9", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		card6 = new Card("jack", "heart");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		Player[] ps = {p2, p1};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("B", game.findGameWinner());
        }

    	for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("5", "spade");
    		Card card2 = new Card("ace", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("king", "heart");
    		Card card5 = new Card("4", "spade");
    		Card card6 = new Card("10", "diamond");
    		Card card7 = new Card("3", "diamond");
    		Card[] handA = {card1, card2, card3, card4, card5, card6, card7};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("5", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("9", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		card6 = new Card("jack", "heart");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		Player[] ps = {p2, p1};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("B", game.findGameWinner());
        }
   }

	public void testGameOfWar06()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("5", "spade");
    		Card card2 = new Card("ace", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("king", "heart");
    		Card card5 = new Card("3", "spade");
    		Card card6 = new Card("4", "diamond");
    		Card card7 = new Card("3", "diamond");
    		Card[] handA = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("3", "club");
    		card2 = new Card("4", "diamond");
    		card3 = new Card("4", "diamond");
    		card4 = new Card("3", "heart");
    		card5 = new Card("2", "spade");
    		card6 = new Card("4", "heart");
    		card7 = new Card("2", "diamond");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("5", "spade");
    		card2 = new Card("9", "club");
    		card3 = new Card("9", "diamond");
    		card4 = new Card("10", "heart");
    		card5 = new Card("jack", "spade");
    		card6 = new Card("ace", "diamond");
    		card7 = new Card("10", "diamond");
    		Card[] handC = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		Player[] ps = {p2, p3, p1};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }

    	for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("5", "spade");
    		Card card2 = new Card("ace", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("king", "heart");
    		Card card5 = new Card("3", "spade");
    		Card card6 = new Card("4", "diamond");
    		Card card7 = new Card("3", "diamond");
    		Card[] handA = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("3", "club");
    		card2 = new Card("4", "diamond");
    		card3 = new Card("4", "diamond");
    		card4 = new Card("3", "heart");
    		card5 = new Card("2", "spade");
    		card6 = new Card("4", "heart");
    		card7 = new Card("2", "diamond");
    		Card[] handB = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("5", "spade");
    		card2 = new Card("9", "club");
    		card3 = new Card("9", "diamond");
    		card4 = new Card("10", "heart");
    		card5 = new Card("jack", "spade");
    		card6 = new Card("ace", "diamond");
    		card7 = new Card("10", "diamond");
    		Card[] handC = {card1, card2, card3, card4, card5, card6};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		Player[] ps = {p2, p3, p1};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }
}

	public void testGameOfWar07()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("5", "spade");
    		Card[] handA = {card1};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("2", "club");
    		Card card2 = new Card("4", "diamond");
    		Card card3 = new Card("4", "diamond");
    		Card card4 = new Card("3", "heart");
    		Card card5 = new Card("2", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		Player[] ps = {p2, p1};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("B", game.findGameWinner());
        }

    	for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("5", "spade");
    		Card[] handA = {card1};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("2", "club");
    		Card card2 = new Card("4", "diamond");
    		Card card3 = new Card("4", "diamond");
    		Card card4 = new Card("3", "heart");
    		Card card5 = new Card("2", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		Player[] ps = {p2, p1};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("B", game.findGameWinner());
        }
    }

	public void testGameOfWar08()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("ace", "spade");
    		Card card2 = new Card("4", "diamond");
    		Card[] handA = {card1, card2};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("ace", "club");
    		card2 = new Card("4", "diamond");
    		Card card3 = new Card("4", "diamond");
    		Card card4 = new Card("3", "heart");
    		Card card5 = new Card("5", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		Player[] ps = {p2, p1};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("B", game.findGameWinner());
        }

	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("ace", "spade");
    		Card card2 = new Card("4", "diamond");
    		Card[] handA = {card1, card2};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("ace", "club");
    		card2 = new Card("4", "diamond");
    		Card card3 = new Card("4", "diamond");
    		Card card4 = new Card("3", "heart");
    		Card card5 = new Card("5", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		Player[] ps = {p2, p1};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("B", game.findGameWinner());
        }
    }

	public void testGameOfWar09()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("ace", "spade");
    		Card card2 = new Card("6", "diamond");
    		Card card3 = new Card("king", "diamond");
    		Card card4 = new Card("3", "heart");
    		Card[] handA = {card1, card2, card3, card4};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("queen", "club");
    		card2 = new Card("5", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("7", "heart");
    		Card card5 = new Card("5", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("jack", "heart");
    		card2 = new Card("5", "diamond");
    		card3 = new Card("10", "spade");
    		card4 = new Card("7", "heart");
    		card5 = new Card("5", "spade");
    		Card card6 = new Card("3", "heart");
    		Card card7 = new Card("7", "spade");
    		Card card8 = new Card("3", "heart");
    		Card card9 = new Card("8", "spade");
    		Card[] handC = {card1, card2, card3, card4, card5, card6, card7, card8, card9};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		card1 = new Card("10", "diamond");
    		card2 = new Card("7", "diamond");
    		Card[] handE = {card1, card2};
    		ArrayList<Card> hand5 = new ArrayList<Card>();
    		for (Card c : handE)
    		   hand5.add(c);
    		Player p5 = new Player("E", hand5);
    
    		card1 = new Card("king", "heart");
    		Card[] handD = {card1};
    		ArrayList<Card> hand4 = new ArrayList<Card>();
    		for (Card c : handD)
    		   hand4.add(c);
    		Player p4 = new Player("D", hand4);
    
    		Player[] ps = {p2, p3, p1, p5, p4};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("A", game.findGameWinner());
        }

	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("ace", "spade");
    		Card card2 = new Card("6", "diamond");
    		Card card3 = new Card("king", "diamond");
    		Card card4 = new Card("3", "heart");
    		Card[] handA = {card1, card2, card3, card4};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("queen", "club");
    		card2 = new Card("5", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("7", "heart");
    		Card card5 = new Card("5", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("jack", "heart");
    		card2 = new Card("5", "diamond");
    		card3 = new Card("10", "spade");
    		card4 = new Card("7", "heart");
    		card5 = new Card("5", "spade");
    		Card card6 = new Card("3", "heart");
    		Card card7 = new Card("7", "spade");
    		Card card8 = new Card("3", "heart");
    		Card card9 = new Card("8", "spade");
    		Card[] handC = {card1, card2, card3, card4, card5, card6, card7, card8, card9};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		card1 = new Card("10", "diamond");
    		card2 = new Card("7", "diamond");
    		Card[] handE = {card1, card2};
    		ArrayList<Card> hand5 = new ArrayList<Card>();
    		for (Card c : handE)
    		   hand5.add(c);
    		Player p5 = new Player("E", hand5);
    
    		card1 = new Card("king", "heart");
    		Card[] handD = {card1};
    		ArrayList<Card> hand4 = new ArrayList<Card>();
    		for (Card c : handD)
    		   hand4.add(c);
    		Player p4 = new Player("D", hand4);
    
    		Player[] ps = {p2, p3, p1, p5, p4};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("A", game.findGameWinner());
        }
    }

	public void testGameOfWar10()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("ace", "spade");
    		Card card2 = new Card("4", "diamond");
    		Card card3 = new Card("king", "diamond");
    		Card card4 = new Card("3", "heart");
    		Card card5 = new Card("5", "spade");
    		Card card6 = new Card("3", "heart");
    		Card card7 = new Card("7", "spade");
    		Card card8 = new Card("3", "heart");
    		Card card9 = new Card("3", "heart");
    		Card[] handA = {card1, card2, card3, card4, card5, card6, card7, card8, card9};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("ace", "club");
    		card2 = new Card("5", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("7", "heart");
    		card5 = new Card("4", "spade");
    		card6 = new Card("king", "heart");
    		card7 = new Card("queen", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5, card6, card7};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("ace", "heart");
    		card2 = new Card("5", "diamond");
    		card3 = new Card("10", "spade");
    		card4 = new Card("7", "heart");
    		card5 = new Card("5", "spade");
    		card6 = new Card("3", "heart");
    		card7 = new Card("7", "spade");
    		card8 = new Card("3", "heart");
    		card9 = new Card("8", "spade");
    		Card[] handC = {card1, card2, card3, card4, card5, card6, card7, card8, card9};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		card1 = new Card("2", "diamond");
    		card2 = new Card("2", "spade");
    		Card[] handE = {card1, card2};
    		ArrayList<Card> hand5 = new ArrayList<Card>();
    		for (Card c : handE)
    		   hand5.add(c);
    		Player p5 = new Player("E", hand5);
    
    		card1 = new Card("3", "heart");
    		Card[] handD = {card1};
    		ArrayList<Card> hand4 = new ArrayList<Card>();
    		for (Card c : handD)
    		   hand4.add(c);
    		Player p4 = new Player("D", hand4);
    
    		Player[] ps = {p2, p3, p1, p5, p4};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }

	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    		Card card1 = new Card("ace", "spade");
    		Card card2 = new Card("4", "diamond");
    		Card card3 = new Card("king", "diamond");
    		Card card4 = new Card("3", "heart");
    		Card card5 = new Card("5", "spade");
    		Card card6 = new Card("3", "heart");
    		Card card7 = new Card("7", "spade");
    		Card card8 = new Card("3", "heart");
    		Card card9 = new Card("3", "heart");
    		Card[] handA = {card1, card2, card3, card4, card5, card6, card7, card8, card9};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("A", hand1);
    
    		card1 = new Card("ace", "club");
    		card2 = new Card("5", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("7", "heart");
    		card5 = new Card("4", "spade");
    		card6 = new Card("king", "heart");
    		card7 = new Card("queen", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5, card6, card7};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("B", hand2);
    
    		card1 = new Card("ace", "heart");
    		card2 = new Card("5", "diamond");
    		card3 = new Card("10", "spade");
    		card4 = new Card("7", "heart");
    		card5 = new Card("5", "spade");
    		card6 = new Card("3", "heart");
    		card7 = new Card("7", "spade");
    		card8 = new Card("3", "heart");
    		card9 = new Card("8", "spade");
    		Card[] handC = {card1, card2, card3, card4, card5, card6, card7, card8, card9};
    		ArrayList<Card> hand3 = new ArrayList<Card>();
    		for (Card c : handC)
    		   hand3.add(c);
    		Player p3 = new Player("C", hand3);
    
    		card1 = new Card("2", "diamond");
    		card2 = new Card("2", "spade");
    		Card[] handE = {card1, card2};
    		ArrayList<Card> hand5 = new ArrayList<Card>();
    		for (Card c : handE)
    		   hand5.add(c);
    		Player p5 = new Player("E", hand5);
    
    		card1 = new Card("3", "heart");
    		Card[] handD = {card1};
    		ArrayList<Card> hand4 = new ArrayList<Card>();
    		for (Card c : handD)
    		   hand4.add(c);
    		Player p4 = new Player("D", hand4);
    
    		Player[] ps = {p2, p3, p1, p5, p4};
    		for(int i = 0; i < ps.length; i++)
            {
                int ind1 = (int)(Math.random() * ps.length);
                int ind2 = (int)(Math.random() * ps.length);
                Player temp = ps[ind1];
                ps[ind1] = ps[ind2];
                ps[ind2] = temp;
            }
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("C", game.findGameWinner());
        }
    }

// ****************  MasterMind
	public void testMasterMind01()
	{
	    MasterMind mm = new MasterMind();
	    assertEquals(true, mm.isValidGuess("AQCW"));
	    mm.addGuessToHistory(new GuessResult("ABCD", 0, 2));
	    assertEquals(true, mm.isValidGuess("AQCW"));
	    assertEquals(false, mm.isValidGuess("QAWC"));

	    mm = new MasterMind();
	    assertEquals(true, mm.isValidGuess("ABCD"));
	    mm.addGuessToHistory(new GuessResult("ABCD", 0, 0));
	    assertEquals(false, mm.isValidGuess("WAQC"));
	    assertEquals(true, mm.isValidGuess("EFGH"));
	   }

//     public GuessResult(String g, int w, int c)
	public void testMasterMind02()
	{
	    MasterMind mm = new MasterMind();   // ABCD
	    mm.addGuessToHistory(new GuessResult("XXXX", 0, 0));
	    assertEquals(true, mm.isValidGuess("AQCW"));
	    mm.addGuessToHistory(new GuessResult("AQCW", 0, 2));
	    assertEquals(true, mm.isValidGuess("DQBW"));
	    mm.addGuessToHistory(new GuessResult("DQBW", 2, 0));
	    assertEquals(true, mm.isValidGuess("ADCB"));
	    mm.addGuessToHistory(new GuessResult("ADCB", 2, 2));
	    assertEquals(false, mm.isValidGuess("XBXD"));
	    assertEquals(true, mm.isValidGuess("ABCD"));
	    mm.addGuessToHistory(new GuessResult("ABCD", 0, 4));
	    assertEquals(false, mm.isValidGuess("DCBA"));
	    assertEquals(false, mm.isValidGuess("DABC"));
    }

//     public GuessResult(String g, int w, int c)
	public void testMasterMind03()
	{
	    MasterMind mm = new MasterMind();   // RGBY
	    assertEquals(true, mm.isValidGuess("AQCW"));
	    mm.addGuessToHistory(new GuessResult("PADS", 0, 0));
	    assertEquals(true, mm.isValidGuess("WQCZ"));
	    assertEquals(false, mm.isValidGuess("AQCZ"));
	    assertEquals(false, mm.isValidGuess("WPCZ"));
	    assertEquals(false, mm.isValidGuess("WQSZ"));
	    assertEquals(false, mm.isValidGuess("WQCD"));
	    assertEquals(true, mm.isValidGuess("BGFH"));
	    mm.addGuessToHistory(new GuessResult("BGFH", 1, 1));
	    assertEquals(true, mm.isValidGuess("FRTH"));
	    mm.addGuessToHistory(new GuessResult("FHRT", 1, 0));
	    assertEquals(false, mm.isValidGuess("HTCD"));
	    assertEquals(false, mm.isValidGuess("RFCD"));
	    assertEquals(false, mm.isValidGuess("WTFD"));
	    assertEquals(true, mm.isValidGuess("LBFM"));
	    mm.addGuessToHistory(new GuessResult("LBMF", 1, 0));
	    assertEquals(false, mm.isValidGuess("KYBG"));
	    assertEquals(false, mm.isValidGuess("YFBG"));
	    assertEquals(false, mm.isValidGuess("KYBG"));
	    mm.addGuessToHistory(new GuessResult("KYBG", 2, 1));
	    assertEquals(false, mm.isValidGuess("YMBK"));
	    assertEquals(false, mm.isValidGuess("YMBL"));
	    assertEquals(false, mm.isValidGuess("FGBY"));
	    assertEquals(true, mm.isValidGuess("RGBY"));
    }

//     public GuessResult(String g, int w, int c)
//     add guesssResults have 0 correct locations, c = 0
	public void testMasterMind04()
	{
	    MasterMind mm = new MasterMind();   // ABCD
	    
	    assertEquals(true, mm.isValidGuess("AQCW"));
	    mm.addGuessToHistory(new GuessResult("BGFH", 1, 0));
	    assertEquals(true, mm.isValidGuess("HART"));
	    mm.addGuessToHistory(new GuessResult("HART", 1, 0));
	    assertEquals(true, mm.isValidGuess("ABCD"));
	    assertEquals(true, mm.isValidGuess("FTCD"));
	    assertEquals(false, mm.isValidGuess("HGCD"));
	    mm.addGuessToHistory(new GuessResult("BADC", 4, 0));

	    assertEquals(true, mm.isValidGuess("ABCD"));
	    assertEquals(false, mm.isValidGuess("DACB"));
	    assertEquals(true, mm.isValidGuess("DCBA"));
    }

//     public GuessResult(String g, int w, int c)
//     add guesssResults have 0 incorrect locations, w = 0
	public void testMasterMind05()
	{
	    MasterMind mm = new MasterMind();   // AABB
	    mm.addGuessToHistory(new GuessResult("ACBD", 0, 2));
	    assertEquals(true, mm.isValidGuess("MCMD"));
	    assertEquals(true, mm.isValidGuess("ACKL"));
	    assertEquals(true, mm.isValidGuess("LCBM"));
	    assertEquals(false, mm.isValidGuess("CADB"));
	    assertEquals(false, mm.isValidGuess("ABKL"));

	    mm.addGuessToHistory(new GuessResult("CADB", 0, 2));
	    assertEquals(false, mm.isValidGuess("MCMD"));
	    assertEquals(false, mm.isValidGuess("ACKL"));
	    assertEquals(false, mm.isValidGuess("LCBM"));
	    assertEquals(true, mm.isValidGuess("AABB"));
    }

//     public GuessResult(String g, int w, int c)
	public void testMasterMind06()
	{
	    MasterMind mm = new MasterMind();   // CCCA
	    mm.addGuessToHistory(new GuessResult("ACBD", 0, 1));
	    assertEquals(false, mm.isValidGuess("ADBC"));
	    assertEquals(false, mm.isValidGuess("AHJB"));
	    assertEquals(false, mm.isValidGuess("HDBC"));
	    assertEquals(true, mm.isValidGuess("HKBL"));
	    assertEquals(true, mm.isValidGuess("AZZZ"));
	    assertEquals(true, mm.isValidGuess("CCEE"));

	    mm.addGuessToHistory(new GuessResult("CCEE", 0, 3));
	    mm.addGuessToHistory(new GuessResult("EABB", 1, 0));
	    assertEquals(false, mm.isValidGuess("CAEE"));
	    assertEquals(false, mm.isValidGuess("CCED"));
	    assertEquals(true, mm.isValidGuess("CCCE"));
    }

//     public GuessResult(String g, int w, int c)
	public void testMasterMind07()
	{
	    MasterMind mm = new MasterMind();   // XYXY
	    mm.addGuessToHistory(new GuessResult("CDBA", 0, 0));
	    assertEquals(false, mm.isValidGuess("ADBC"));
	    assertEquals(false, mm.isValidGuess("AHJB"));
	    assertEquals(false, mm.isValidGuess("HDBC"));
	    assertEquals(true, mm.isValidGuess("HKPL"));
	    assertEquals(true, mm.isValidGuess("WZZZ"));
	    assertEquals(false, mm.isValidGuess("CCEE"));

	    mm.addGuessToHistory(new GuessResult("GHJK", 0, 0));
	    assertEquals(false, mm.isValidGuess("CAEE"));
	    assertEquals(false, mm.isValidGuess("CHPL"));
	    assertEquals(true, mm.isValidGuess("WXYZ"));

	    mm.addGuessToHistory(new GuessResult("LMON", 0, 0));
	    assertEquals(false, mm.isValidGuess("AGOZ"));
	    assertEquals(false, mm.isValidGuess("AXYZ"));
	    assertEquals(false, mm.isValidGuess("KXYZ"));
	    assertEquals(false, mm.isValidGuess("OZYX"));
	    assertEquals(true, mm.isValidGuess("WXYZ"));

	    mm.addGuessToHistory(new GuessResult("YXYX", 4, 0));
	    assertEquals(true, mm.isValidGuess("XYXY"));
	    assertEquals(false, mm.isValidGuess("YXYX"));
	    assertEquals(false, mm.isValidGuess("XXXY"));
	    assertEquals(false, mm.isValidGuess("XXYY"));
    }

//     public GuessResult(String g, int w, int c)
	public void testMasterMind08()
	{
	    MasterMind mm = new MasterMind();   // AAAA
	    assertEquals(true, mm.isValidGuess("BBBB"));
	    mm.addGuessToHistory(new GuessResult("ABCD", 0, 1));
	    assertEquals(true, mm.isValidGuess("BBBB"));
	    assertEquals(false, mm.isValidGuess("EBHC"));
	    assertEquals(true, mm.isValidGuess("EBFG"));
	    assertEquals(true, mm.isValidGuess("AHJA"));

	    mm.addGuessToHistory(new GuessResult("AHJA", 0, 2));
	    assertEquals(true, mm.isValidGuess("AHMN"));
	    assertEquals(false, mm.isValidGuess("PHCA"));
	    assertEquals(false, mm.isValidGuess("AAJP"));
	    assertEquals(false, mm.isValidGuess("AHQA"));
	    assertEquals(true, mm.isValidGuess("AAAA"));
    }

//     public GuessResult(String g, int w, int c)
	public void testMasterMind09()
	{
	    MasterMind mm = new MasterMind();   // APCS
	    mm.addGuessToHistory(new GuessResult("AABB", 0, 1));
	    assertEquals(true, mm.isValidGuess("CDBF"));
	    assertEquals(true, mm.isValidGuess("PACS"));
	    mm.addGuessToHistory(new GuessResult("DATA", 1, 0));
	    assertEquals(false, mm.isValidGuess("CDTA"));
	    assertEquals(false, mm.isValidGuess("EATS"));
	    assertEquals(false, mm.isValidGuess("APTF"));
	    assertEquals(false, mm.isValidGuess("WACS"));
	    assertEquals(true, mm.isValidGuess("AWCS"));

	    mm.addGuessToHistory(new GuessResult("APSF", 1, 2));
	    assertEquals(true, mm.isValidGuess("APQS"));
	    assertEquals(false, mm.isValidGuess("APSS"));
	    assertEquals(false, mm.isValidGuess("PASC"));
	    assertEquals(false, mm.isValidGuess("PPAF"));
	    assertEquals(false, mm.isValidGuess("AAAA"));
	    assertEquals(true, mm.isValidGuess("APXS"));
    }

//     public GuessResult(String g, int w, int c)
	public void testMasterMind10()
	{
	    MasterMind mm = new MasterMind();   // HELP
	    mm.addGuessToHistory(new GuessResult("ELKS", 2, 0));
	    assertEquals(false, mm.isValidGuess("CDBF"));
	    assertEquals(false, mm.isValidGuess("PACS"));
	    assertEquals(true, mm.isValidGuess("LOSP"));
	    assertEquals(false, mm.isValidGuess("LOOP"));
	    mm.addGuessToHistory(new GuessResult("LOOP", 1, 1));
	    assertEquals(false, mm.isValidGuess("CDTA"));
	    assertEquals(false, mm.isValidGuess("EATS"));
	    assertEquals(false, mm.isValidGuess("APTF"));
	    assertEquals(true, mm.isValidGuess("OESP"));
	    assertEquals(false, mm.isValidGuess("LESP"));
	    assertEquals(true, mm.isValidGuess("AELP"));

	    mm.addGuessToHistory(new GuessResult("WINS", 0, 0));
	    assertEquals(false, mm.isValidGuess("OESP"));
	    mm.addGuessToHistory(new GuessResult("KRLP", 0, 2));
	    assertEquals(true, mm.isValidGuess("AELP"));
	    assertEquals(true, mm.isValidGuess("HELP"));
	    mm.addGuessToHistory(new GuessResult("AELP", 0, 3));
	    assertEquals(false, mm.isValidGuess("AELP"));
	    assertEquals(false, mm.isValidGuess("ETP"));
	    assertEquals(true, mm.isValidGuess("HELP"));
    }

//     public GuessResult(String g, int w, int c)
//     add guesssResults have 0 correct locations, c = 0
	public void testMasterMind11()
	{
	    MasterMind mm = new MasterMind();   // ABCD

	    mm.addGuessToHistory(new GuessResult("BHDG", 2, 0));
	    assertEquals(true, mm.isValidGuess("HDRT"));
	    assertEquals(true, mm.isValidGuess("ABHT"));
	    assertEquals(false, mm.isValidGuess("BDRT"));
	    assertEquals(false, mm.isValidGuess("WHGT"));
	    assertEquals(false, mm.isValidGuess("RBDT"));
	    mm.addGuessToHistory(new GuessResult("DABR", 3, 0));
	    assertEquals(true, mm.isValidGuess("ABCD"));
	    assertEquals(false, mm.isValidGuess("FTCD"));
	    assertEquals(true, mm.isValidGuess("ABXD"));
	    assertEquals(true, mm.isValidGuess("ABWD"));
	    assertEquals(false, mm.isValidGuess("ABGD"));
	    assertEquals(true, mm.isValidGuess("RBCD"));
	    mm.addGuessToHistory(new GuessResult("CADB", 4, 0));

	    assertEquals(true, mm.isValidGuess("ABCD"));
	    assertEquals(false, mm.isValidGuess("ACBD"));
	    assertEquals(false, mm.isValidGuess("DCBA"));
	    assertEquals(false, mm.isValidGuess("BDCA"));
	    assertEquals(false, mm.isValidGuess("CBDA"));
    }

//     public GuessResult(String g, int w, int c)
//     add guesssResults have 0 correct COLORS, w = 0 and c = 0
	public void testMasterMind12()
	{
	    MasterMind mm = new MasterMind();   // WXYZ

	    mm.addGuessToHistory(new GuessResult("BHDG", 0, 0));
	    assertEquals(false, mm.isValidGuess("HART"));
	    assertEquals(false, mm.isValidGuess("ABQT"));
	    assertEquals(false, mm.isValidGuess("QDRT"));
	    assertEquals(false, mm.isValidGuess("WQGT"));
	    assertEquals(true, mm.isValidGuess("RQXT"));
	    mm.addGuessToHistory(new GuessResult("STUV", 0, 0));
	    assertEquals(true, mm.isValidGuess("AJKL"));
	    assertEquals(false, mm.isValidGuess("FTCD"));
	    assertEquals(false, mm.isValidGuess("ABXD"));
	    assertEquals(true, mm.isValidGuess("FYZM"));
	    assertEquals(false, mm.isValidGuess("AVCZ"));
	    assertEquals(false, mm.isValidGuess("QQQV"));
	    assertEquals(false, mm.isValidGuess("VQQQ"));

	    mm.addGuessToHistory(new GuessResult("LMNP", 0, 0));
	    // NO:   BDGHLMNPSTUV
	    assertEquals(true, mm.isValidGuess("WXYZ"));
	    assertEquals(false, mm.isValidGuess("BXYZ"));
	    assertEquals(false, mm.isValidGuess("WLYZ"));
	    assertEquals(false, mm.isValidGuess("WXMZ"));
	    assertEquals(false, mm.isValidGuess("WXYP"));
	    assertEquals(false, mm.isValidGuess("WXSZ"));
	    assertEquals(false, mm.isValidGuess("WTYZ"));
	    assertEquals(false, mm.isValidGuess("UXYZ"));
	    assertEquals(true, mm.isValidGuess("ACEF"));
    }
//     public GuessResult(String g, int w, int c)
//     add guesssResults have 0 correct COLORS, w = 0 and c = 0
	public void testMasterMind13()
	{
	    MasterMind mm = new MasterMind();   // ABCD

	    mm.addGuessToHistory(new GuessResult("EFGH", 0, 0));
	    assertEquals(false, mm.isValidGuess("EBCD"));
	    assertEquals(false, mm.isValidGuess("ABCE"));
	    assertEquals(false, mm.isValidGuess("FBCD"));
	    assertEquals(false, mm.isValidGuess("ABCF"));
	    assertEquals(true, mm.isValidGuess("ABCD"));
	    mm.addGuessToHistory(new GuessResult("JKLM", 0, 0));
	    assertEquals(false, mm.isValidGuess("AJCD"));
	    assertEquals(false, mm.isValidGuess("ABKD"));
	    assertEquals(false, mm.isValidGuess("ABCL"));
	    assertEquals(false, mm.isValidGuess("HBCD"));
	    assertEquals(false, mm.isValidGuess("MBCD"));
	    assertEquals(true, mm.isValidGuess("ABCD"));
	    assertEquals(true, mm.isValidGuess("NPOQ"));

	    mm.addGuessToHistory(new GuessResult("INOP", 0, 0));
	    assertEquals(true, mm.isValidGuess("WXYZ"));
	    assertEquals(false, mm.isValidGuess("OBCD"));
	    assertEquals(false, mm.isValidGuess("ABCI"));
	    assertEquals(false, mm.isValidGuess("APCD"));
	    assertEquals(false, mm.isValidGuess("ABND"));
	    assertEquals(false, mm.isValidGuess("ABCE"));
	    assertEquals(false, mm.isValidGuess("NBCD"));
	    assertEquals(false, mm.isValidGuess("ABHD"));
	    assertEquals(true, mm.isValidGuess("ABCD"));
    }
}