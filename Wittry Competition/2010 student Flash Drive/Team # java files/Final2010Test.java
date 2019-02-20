import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class Final2010Test extends junit.framework.TestCase
{
   public void testClimbThis01()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("BOY");
      words.add("TOY");
      words.add("TOE");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("HEAD");
      words.add("HEAL");
      words.add("VEAL");
      words.add("VEIL");
      words.add("VAIL");
      words.add("TAIL");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("CAME");
      words.add("CARE");
      words.add("CANT");
      words.add("WENT");
      assertEquals(false, ladder.isLadder(words));
   }

   public void testClimbThis02()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("ELEPHANT");
      words.add("ELEPHANS");
      words.add("TLEPHANS");
      words.add("TOEPHANS");
      words.add("TOEPHONS");
      words.add("TOEPTONS");
      words.add("TOEPTOES");
      words.add("TOMPTOES");
      words.add("TOMATOES");
      assertEquals(true, ladder.isLadder(words));
      words.add("TOMATOSE");
      assertEquals(false, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("D");
      words.add("L");
      words.add("E");
      words.add("V");
      words.add("I");
      words.add("T");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("CAME");
      words.add("CARE");
      words.add("CANT");
      words.add("WENT");
      assertEquals(false, ladder.isLadder(words));
   }

   public void testClimbThis03()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("PROGRAMMINGCONTEST");
      words.add("PROGRAMIINGCONTEST");
      words.add("PROGRAMIINGCONTETT");
      words.add("PROGRAMIINGCONTTTT");
      words.add("PROGRAMIINGGONTTTT");
      words.add("PROGRAMIINGTONTTTT");
      words.add("TROGRAMIINGTONTTTT");
      words.add("TRTGRAMIINGTONTTTT");
      words.add("TRTGRAMIINGTTNTTTT");
      assertEquals(true, ladder.isLadder(words));
      words.add("TRTGRAMIINGTTTTTTT");
      words.add("TRTGRAMTINGTTTTTTT");
      words.add("TRTGRTMTINGTTTTTTT");
      words.add("TRTGRTMTITGTTTTTTT");
      words.add("TRTGTTMTITGTTTTTTT");
      words.add("TTTGTTMTITGTTTTTTT");
      assertEquals(true, ladder.isLadder(words));
      words.add("TTTGTTMTITGTTTTTTT");
      assertEquals(false, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("DO");
      words.add("LO");
      words.add("MO");
      words.add("GO");
      words.add("NO");
      assertEquals(true, ladder.isLadder(words));
      words.add("NON");
      assertEquals(false, ladder.isLadder(words));
   }

   public void testClimbThis04()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("ABCDEF");
      words.add("ABCDEE");
      words.add("ABCEEE");
      assertEquals(true, ladder.isLadder(words));
      words.add("EEABCE");
      assertEquals(false, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("BOOKKEEPER");
      words.add("BOOKKEEPEE");
      assertEquals(true, ladder.isLadder(words));
      words.add("BOOOOEEPEE");
      assertEquals(false, ladder.isLadder(words));
      words.add("BOOOOOOPEE");
      assertEquals(false, ladder.isLadder(words));
      words.add("BOOOOOOPOO");
      assertEquals(false, ladder.isLadder(words));
   }

   public void testClimbThis05()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("ABCDEF");
      words.add("FABCDE");
      assertEquals(false, ladder.isLadder(words));
      words.add("EFABCD");
      assertEquals(false, ladder.isLadder(words));
      words.add("DEFABC");
      assertEquals(false, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("COMPUTER");
      words.add("COMMUTER");
      assertEquals(true, ladder.isLadder(words));
      words.add("COMPUTER");
      assertEquals(true, ladder.isLadder(words));
   }

   public void testClimbThis06()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("JAVA");
      words.add("JABA");
      words.add("BABA");
      words.add("BACA");
      assertEquals(true, ladder.isLadder(words));
      words.add("BOCO");
      assertEquals(false, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("CLIMBTHIS");
      words.add("SLIMBTHIS");
      words.add("SLIMETHIS");
      assertEquals(true, ladder.isLadder(words));
      words.add("SLIMTHISE");
      assertEquals(false, ladder.isLadder(words));
   }

   public void testClimbThis07()
   {
      testClimbThis01();
      testClimbThis02();
   }

   public void testClimbThis08()
   {
      testClimbThis03();
      testClimbThis04();
   }

   public void testClimbThis09()
   {
      testClimbThis05();
      testClimbThis06();
   }

   public void testClimbThis10()
   {
      testClimbThis08();
      testClimbThis09();
      testClimbThis07();
   }

   public void testManipulateThis01()
   {
      ManipulateThis str = new ManipulateThis("Manipulate");
      str.reverse(0,3);
      assertEquals("inaMpulate", str.toString());

      str.swap(3, 8);
      assertEquals("inatpulaMe", str.toString());

      str.insert("This", 8);
      assertEquals("inatpulaThisMe", str.toString());

      str.substitute("This", "Rgua");
      assertEquals("inatpulaRguaMe", str.toString());

      str.delete(2, 7);
      assertEquals("inRguaMe", str.toString());

      str.insert("wRg", 0);
      assertEquals("wRginRguaMe", str.toString());

      str.replace("Rg", "aBc");
      assertEquals("waBcinaBcuaMe", str.toString());

      str.changeCase();
      assertEquals("WAbCINAbCUAmE", str.toString());

      str.append("append");
      assertEquals("WAbCINAbCUAmEappend", str.toString());

      str.repeat(1, 4);
      assertEquals("WAbCINAbCUAmEappendAbCI", str.toString());
   }

   public void testManipulateThis02() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      assertEquals("Programming", str.toString());

      str = new ManipulateThis("test me!");
      assertEquals("test me!", str.toString());

      str = new ManipulateThis("123456789 || $%&()_");
      assertEquals("123456789 || $%&()_", str.toString());
   }

   public void testManipulateThis03() 
   {
      ManipulateThis str = new ManipulateThis("Programming");

      str.assign("!@#$%^&");
      assertEquals("!@#$%^&", str.toString());

      str = new ManipulateThis("test me!");
      assertEquals("test me!", str.toString());
      str.assign("ASDFGlkjhg");
      assertEquals("ASDFGlkjhg", str.toString());

      str = new ManipulateThis("123456789 || $%&()_");
      assertEquals("123456789 || $%&()_", str.toString());
      str.assign("");
      assertEquals("", str.toString());
   }

   public void testManipulateThis04() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.reverse(2, 4);
      assertEquals("Prrgoamming", str.toString());

      str = new ManipulateThis("Test me!");
      str.reverse(0, 6);
      assertEquals("em tseT!", str.toString());

      str = new ManipulateThis("0123456789xABCDEF");
      str.reverse(11, 16);
      assertEquals("0123456789xFEDCBA", str.toString());

      str = new ManipulateThis("01234");
      str.reverse(1, 2);
      assertEquals("02134", str.toString());
    }

   public void testManipulateThis05() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.swap(3, 8);
      assertEquals("Proirammgng", str.toString());

      str = new ManipulateThis("Test me!");
      str.swap(0, 7);
      assertEquals("!est meT", str.toString());

      str = new ManipulateThis("01234");
      str.swap(2, 3);
      assertEquals("01324", str.toString());
    }

   public void testManipulateThis06() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.insert(" Contest", "Programming".length());
      assertEquals("Programming Contest", str.toString());

      str = new ManipulateThis("Test me!");
      str.insert("Please ", 0);
      assertEquals("Please Test me!", str.toString());

      str = new ManipulateThis("01234");
      str.insert("-", 2);
      assertEquals("01-234", str.toString());
      str.insert("-", 4);
      assertEquals("01-2-34", str.toString());
      str.insert("- ", 1);
      assertEquals("0- 1-2-34", str.toString());
    }

   public void testManipulateThis07() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.substitute("gramm", "GRAMM");
      assertEquals("ProGRAMMing", str.toString());

      str = new ManipulateThis("123456789");
      str.substitute("23", "WXYZ");
      assertEquals("1WXYZ456789", str.toString());

      str = new ManipulateThis("01234");
      str.substitute("0", "---");
      assertEquals("---1234", str.toString());
      str.substitute("-", "20");
      assertEquals("20--1234", str.toString());
      str.substitute("4", "**");
      assertEquals("20--123**", str.toString());
    }


   public void testManipulateThis08() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.delete(2, 7);
      assertEquals("Pring", str.toString());

      str = new ManipulateThis("123456789");
      str.delete(0, 0);
      assertEquals("23456789", str.toString());
      str.delete(str.toString().length()-1, str.toString().length()-1);
      assertEquals("2345678", str.toString());
      str.delete(1, 2);
      assertEquals("25678", str.toString());
      str.delete(0, str.toString().length()-1);
      assertEquals("", str.toString());
    }

   public void testManipulateThis09() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.replace("mm", "aBc");
      assertEquals("PrograaBcing", str.toString());

      str = new ManipulateThis("123456789");
      str.replace("12", "xx");
      assertEquals("xx3456789", str.toString());
      str.replace("9", "xx");
      assertEquals("xx345678xx", str.toString());
      str.replace("x", "er");
      assertEquals("erer345678erer", str.toString());
      str.replace("re", "-");
      assertEquals("e-r345678e-r", str.toString());

      str = new ManipulateThis("0011223344");
      str.replace("0", "a");
      assertEquals("aa11223344", str.toString());
      str.replace("a1", "xy");
      assertEquals("axy1223344", str.toString());
      str.replace("4", "**");
      assertEquals("axy12233****", str.toString());

      ManipulateThis mt = new ManipulateThis("abcabcab");
      mt.replace("bcab", "wxyz");
      assertEquals("abcawxyz", mt.toString());

      mt = new ManipulateThis("abcabbcab");
      mt.replace("bcab", "wxyz");
      assertEquals("awxyzwxyz", mt.toString());

      mt = new ManipulateThis("abcabcab");
      mt.replace("bcab", "b");
      assertEquals("ab", mt.toString());
   }

   public void testManipulateThis10() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.changeCase();
      assertEquals("pROGRAMMING", str.toString());

      str = new ManipulateThis("A1234B56789C");
      str.changeCase();
      assertEquals("a1234b56789c", str.toString());
      str.changeCase();
      assertEquals("A1234B56789C", str.toString());

      str = new ManipulateThis("asd123JKL#5");
      str.changeCase();
      assertEquals("ASD123jkl#5", str.toString());
      str.changeCase();
      assertEquals("asd123JKL#5", str.toString());

      str = new ManipulateThis("asd123JKL#5QWE");
      str.changeCase();
      assertEquals("ASD123jkl#5qwe", str.toString());
      str.changeCase();
      assertEquals("asd123JKL#5QWE", str.toString());
   }

   public void testManipulateThis11() 
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.append("append");
      assertEquals("Programmingappend", str.toString());

      str = new ManipulateThis("A1234B56789C");
      str.append("append");
      assertEquals("A1234B56789Cappend", str.toString());
      str.append("append");
      assertEquals("A1234B56789Cappendappend", str.toString());

      str = new ManipulateThis("asd123JKL#5");
      str.append("append");
      assertEquals("asd123JKL#5append", str.toString());
      str.append("append");
      assertEquals("asd123JKL#5appendappend", str.toString());

      str = new ManipulateThis("asd123JKL#5QWE");
      str.append("append");
      assertEquals("asd123JKL#5QWEappend", str.toString());
      str.append("append");
      assertEquals("asd123JKL#5QWEappendappend", str.toString());
   }
   public void testManipulateThis12() 
   {
      ManipulateThis str = new ManipulateThis("Programming");

      str.repeat(1, 4);
      assertEquals("Programmingrogr", str.toString());

      str.repeat(0,1);
      assertEquals("ProgrammingrogrPr", str.toString());

      str.repeat( str.toString().length()-2, str.toString().length()-1);
      assertEquals("ProgrammingrogrPrPr", str.toString());

      str.repeat(0, str.toString().length()-1);
      assertEquals("ProgrammingrogrPrPrProgrammingrogrPrPr", str.toString());
    }
//   { (stu), (11 individual), (2-4), (5-8), (9-11), (1-11) 

   public void testManipulateThis13()  // 2 - 4
   {
      ManipulateThis str = new ManipulateThis("Programming");
      
      str.reverse(2, 4);
      assertEquals("Prrgoamming", str.toString());
      str.assign("sdffd");
      assertEquals("sdffd", str.toString());

      testManipulateThis02();
      testManipulateThis03();
      testManipulateThis04();
   }

   public void testManipulateThis14()  // 5 - 8
   {
      ManipulateThis str = new ManipulateThis("Programming");
      str.swap(3, 8);
      assertEquals("Proirammgng", str.toString());
      str.insert(" Contest", "Programming".length());
      assertEquals("Proirammgng Contest", str.toString());
      str.insert(" -", str.toString().indexOf(" "));
      assertEquals("Proirammgng - Contest", str.toString());
      str.substitute(" ", ":)");
      assertEquals("Proirammgng:)- Contest", str.toString());
      str.delete(0, 4);
      assertEquals("ammgng:)- Contest", str.toString());

      testManipulateThis05();
      testManipulateThis06();
      testManipulateThis07();
      testManipulateThis08();
   }

   public void testManipulateThis15()  // 9 - 12
   {

      ManipulateThis str = new ManipulateThis("Programming");
      str.replace("mm", "aBc");
      assertEquals("PrograaBcing", str.toString());
      str.changeCase();
      assertEquals("pROGRAAbCING", str.toString());
      str.append("append NOTHING");
      assertEquals("pROGRAAbCINGappend NOTHING", str.toString());
      str.repeat(1, 4);
      assertEquals("pROGRAAbCINGappend NOTHINGROGR", str.toString());
      str.replace("a", "-");
      assertEquals("pROGRAAbCING-ppend NOTHINGROGR", str.toString());
      str.replace("A", "-");
      assertEquals("pROGR--bCING-ppend NOTHINGROGR", str.toString());
      str.replace("R", "*");
      assertEquals("p*OG*--bCING-ppend NOTHING*OG*", str.toString());
      str.replace("p", "=");
      assertEquals("=*OG*--bCING-==end NOTHING*OG*", str.toString());

      testManipulateThis09();
      testManipulateThis10();
      testManipulateThis11();
      testManipulateThis12();
   }

   public void testManipulateThis16()  // all
   {
      testManipulateThis13();
      testManipulateThis14();
      testManipulateThis15();
   }

   public void testEdnaGoesToVegas01()
   {
       ArrayList<Fraction> die1 = new ArrayList<Fraction>();
       die1.add(new Fraction(1, 2));
       die1.add(new Fraction(1, 5));
       die1.add(new Fraction(3, 10));

       ArrayList<Fraction> die2 = new ArrayList<Fraction>();
       die2.add(new Fraction(1, 5));
       die2.add(new Fraction(1, 10));
       die2.add(new Fraction(3, 10));
       die2.add(new Fraction(2, 5));

       ArrayList<Fraction> die3 = new ArrayList<Fraction>();
       die3.add(new Fraction(1, 10));
       die3.add(new Fraction(9, 10));

       ArrayList< ArrayList<Fraction> > d = new ArrayList< ArrayList<Fraction> >();
       d.add(die1);
       d.add(die2);
       d.add(die3);
       Dice di = new Dice(d);
       EdnaGoesToVegas edna = new EdnaGoesToVegas(di);

       assertEquals(new Fraction(13, 125), edna.getProbability(5));

       Fraction f = new Fraction(1, 3);
       Fraction g = new Fraction(2, 3);
       f.add(g);
       assertEquals(new Fraction(2, 3), g);
       assertEquals(new Fraction(1, 1), f);

       Fraction j = new Fraction(1, 3);
       Fraction k = new Fraction(2, 3);
       j.multiply(k);
       assertEquals(new Fraction(2, 9), j);
       assertEquals(new Fraction(2, 3), k);
   }

   public void testEdnaGoesToVegas02()
   {
       Fraction f = new Fraction(1, 3);
       Fraction g = new Fraction(2, 3);
       f.add(g);
       assertEquals(new Fraction(2, 3), g);
       assertEquals(new Fraction(1, 1), f);

       f = new Fraction(0, 6);
       g = new Fraction(1, 8);
       f.add(g);
       assertEquals(new Fraction(1, 8), f);
       assertEquals(new Fraction(1, 8), g);

       f = new Fraction(0, 6);
       g = new Fraction(1, 8);
       g.add(f);
       assertEquals(new Fraction(0, 6), f);
       assertEquals(new Fraction(1, 8), g);

       f = new Fraction(1, 6);
       g = new Fraction(1, 8);
       f.add(g);
       assertEquals(new Fraction(7, 24), f);
       assertEquals(new Fraction(1, 8), g);

       f = new Fraction(1, 2);
       g = new Fraction(1, 6);
       f.add(g);
       assertEquals(new Fraction(2, 3), f);
       assertEquals(new Fraction(1, 6), g);

       f = new Fraction(11, 34);
       f.add(new Fraction(5, 17));
       assertEquals(new Fraction(21, 34), f);

       f = new Fraction(1, 6);
       g = new Fraction(1, 4);
       f.add(g);
       assertEquals(new Fraction(5, 12), f);
       assertEquals(new Fraction(1, 4), g);

       f = new Fraction(129, 512);
       f.add(new Fraction(127, 512));
       assertEquals(new Fraction(1, 2), f);

       f = new Fraction(63, 512);
       f.add(new Fraction(65, 512));
       f.add(new Fraction(1, 8));
       f.add(new Fraction(1, 8));
       f.add(new Fraction(1, 3));
       f.add(new Fraction(1, 12));
       f.add(new Fraction(1, 12));
       assertEquals(new Fraction(1, 1), f);
   }

   public void testEdnaGoesToVegas03()
   {
       Fraction f = new Fraction(1, 3);
       Fraction g = new Fraction(1, 3);
       f.multiply(g);
       assertEquals(new Fraction(1, 9), f);
       assertEquals(new Fraction(1, 3), g);

       f = new Fraction(1, 6);
       g = new Fraction(1, 8);
       f.multiply(g);
       assertEquals(new Fraction(1, 48), f);
       assertEquals(new Fraction(1, 8), g);

       f = new Fraction(1, 2);
       g = new Fraction(1, 6);
       f.multiply(g);
       assertEquals(new Fraction(1, 12), f);
       assertEquals(new Fraction(1, 6), g);

       f = new Fraction(11, 34);
       f.multiply(new Fraction(5, 17));
       assertEquals(new Fraction(55, 17*34), f);

       f = new Fraction(1, 6);
       f.multiply(new Fraction(1, 4));
       assertEquals(new Fraction(1, 24), f);

       f = new Fraction(11, 51);
       f.multiply(new Fraction(17, 33));
       assertEquals(new Fraction(1, 9), f);

       f = new Fraction(3, 13);
       f.multiply(new Fraction(5, 17));
       f.multiply(new Fraction(6, 13));
       f.multiply(new Fraction(13, 51));
       f.multiply(new Fraction(17, 21));
       assertEquals(new Fraction(10, 1547), f);
    }


   public void testEdnaGoesToVegas04()
   {
       ArrayList<Fraction> die1 = new ArrayList<Fraction>();
       die1.add(new Fraction(1, 2));
       die1.add(new Fraction(1, 5));
       die1.add(new Fraction(3, 20));
       die1.add(new Fraction(3, 20));

       ArrayList<Fraction> die2 = new ArrayList<Fraction>();
       die2.add(new Fraction(1, 5));
       die2.add(new Fraction(1, 10));
       die2.add(new Fraction(7, 10));

       ArrayList<Fraction> die3 = new ArrayList<Fraction>();
       die3.add(new Fraction(1, 10));
       die3.add(new Fraction(1, 3));
       die3.add(new Fraction(1, 6));
       die3.add(new Fraction(2, 5));

       ArrayList<Fraction> die4 = new ArrayList<Fraction>();
       die4.add(new Fraction(2, 3));
       die4.add(new Fraction(1, 3));

       ArrayList< ArrayList<Fraction> > d = new ArrayList< ArrayList<Fraction> >();
       d.add(die1);
       d.add(die2);
       d.add(die3);
       d.add(die4);
       Dice di = new Dice(d);
       EdnaGoesToVegas edna = new EdnaGoesToVegas(di);

       assertEquals(new Fraction(1, 150), edna.getProbability(4));
       assertEquals(new Fraction(373, 2000), edna.getProbability(8));
   }

   public void testEdnaGoesToVegas05()
   {
       ArrayList<Fraction> die1 = new ArrayList<Fraction>();
       die1.add(new Fraction(1, 19));
       die1.add(new Fraction(7, 19));
       die1.add(new Fraction(3, 19));
       die1.add(new Fraction(2, 19));
       die1.add(new Fraction(5, 19));
       die1.add(new Fraction(1, 19));

       ArrayList<Fraction> die2 = new ArrayList<Fraction>();
       die2.add(new Fraction(1, 6));
       die2.add(new Fraction(1, 6));
       die2.add(new Fraction(2, 11));
       die2.add(new Fraction(7, 33));
       die2.add(new Fraction(3, 11));

       ArrayList< ArrayList<Fraction> > d = new ArrayList< ArrayList<Fraction> >();
       d.add(die1);
       d.add(die2);
       Dice di = new Dice(d);
       EdnaGoesToVegas edna = new EdnaGoesToVegas(di);

       assertEquals(new Fraction(61, 627), edna.getProbability(4));
       assertEquals(new Fraction(1, 19*6), edna.getProbability(2));
       assertEquals(new Fraction(3, 19*11), edna.getProbability(11));
       assertEquals(new Fraction(229, 1254), edna.getProbability(6));
    }

   public void testEdnaGoesToVegas06()
   {
       ArrayList<Fraction> die1 = new ArrayList<Fraction>();
       die1.add(new Fraction(1, 9));
       die1.add(new Fraction(2, 9));
       die1.add(new Fraction(1, 3));
       die1.add(new Fraction(1, 9));
       die1.add(new Fraction(1, 9));
       die1.add(new Fraction(1, 9));

       ArrayList<Fraction> die2 = new ArrayList<Fraction>();
       die2.add(new Fraction(1, 6));
       die2.add(new Fraction(1, 6));
       die2.add(new Fraction(1, 3));
       die2.add(new Fraction(1, 12));
       die2.add(new Fraction(1, 12));

       ArrayList<Fraction> die3 = new ArrayList<Fraction>();
       die3.add(new Fraction(11, 25));
       die3.add(new Fraction(7, 25));
       die3.add(new Fraction(2, 25));
       die3.add(new Fraction(1, 5));

       ArrayList< ArrayList<Fraction> > d = new ArrayList< ArrayList<Fraction> >();
       d.add(die1);
       d.add(die2);
       d.add(die3);
       Dice di = new Dice(d);
       EdnaGoesToVegas edna = new EdnaGoesToVegas(di);

       assertEquals(new Fraction(11, 1350), edna.getProbability(3));
       assertEquals(new Fraction(4, 135), edna.getProbability(4));
       assertEquals(new Fraction(1, 540), edna.getProbability(15));
       assertEquals(new Fraction(193, 1350), edna.getProbability(7));
   }

   public void testEdnaGoesToVegas07()
   {
       testEdnaGoesToVegas03();
       testEdnaGoesToVegas02();
   }

   public void testEdnaGoesToVegas08()
   {
       testEdnaGoesToVegas07();
       testEdnaGoesToVegas04();
   }

   public void testEdnaGoesToVegas09()
   {
       testEdnaGoesToVegas08();
       testEdnaGoesToVegas05();
   }

   public void testEdnaGoesToVegas10()
   {
       testEdnaGoesToVegas09();
       testEdnaGoesToVegas06();
   }

   public void testAutomorphicNumber01()
   {
      AutomorphicNumber h = new AutomorphicNumber();

      assertEquals(false, h.isAutomorphicNumber(7));
      assertEquals(true, h.isAutomorphicNumber(5));
      assertEquals(true, h.isAutomorphicNumber(76));
      assertEquals(false, h.isAutomorphicNumber(11));

      int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 25, 26, 75, 76};
//      ArrayList<Integer> ans = h.getAutomorphicNumberFromArray(numbers);
      ArrayList<Integer> sol = new ArrayList<Integer>();
      sol.add(new Integer(1));
      sol.add(new Integer(5));
      sol.add(new Integer(6));
      sol.add(new Integer(25));
      sol.add(new Integer(76));
      assertEquals(sol, h.getAutomorphicNumberFromArray(numbers));
   }

   public void testAutomorphicNumber02()
   {
      AutomorphicNumber h = new AutomorphicNumber();

      assertEquals(true, h.isAutomorphicNumber(9376));
      assertEquals(true, h.isAutomorphicNumber(76));
      assertEquals(true, h.isAutomorphicNumber(5));
      assertEquals(false, h.isAutomorphicNumber(36));
      assertEquals(false, h.isAutomorphicNumber(125));
   }

   public void testAutomorphicNumber03()
   {
      AutomorphicNumber h = new AutomorphicNumber();

      int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 25, 26, 75, 76, 77, 376, 377, 624, 625, 626, 9375, 9376, 9377};
//      ArrayList<Integer> ans = h.getAutomorphicNumberFromArray(numbers);
      ArrayList<Integer> sol = new ArrayList<Integer>();
      sol.add(new Integer(1));
      sol.add(new Integer(5));
      sol.add(new Integer(6));
      sol.add(new Integer(25));
      sol.add(new Integer(76));
      sol.add(new Integer(376));
      sol.add(new Integer(625));
      sol.add(new Integer(9376));
      assertEquals(sol, h.getAutomorphicNumberFromArray(numbers));
   }

   public void testAutomorphicNumber04()
   {
      AutomorphicNumber h = new AutomorphicNumber();

      assertEquals(false, h.isAutomorphicNumber(7));
      assertEquals(true, h.isAutomorphicNumber(5));
      assertEquals(true, h.isAutomorphicNumber(76));
      assertEquals(true, h.isAutomorphicNumber(9376));
      assertEquals(false, h.isAutomorphicNumber(11));
      assertEquals(false, h.isAutomorphicNumber(36));
      assertEquals(false, h.isAutomorphicNumber(125));
   }

   public void testAutomorphicNumber05()
   {
      AutomorphicNumber h = new AutomorphicNumber();

      int [] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 26, 27, 28, 75, 77, 377, 624, 626, 9375, 9377};
      ArrayList<Integer> sol = new ArrayList<Integer>();
      sol.add(new Integer(5));
      sol.add(new Integer(6));
      assertEquals(sol, h.getAutomorphicNumberFromArray(numbers));
   }

   public void testAutomorphicNumber06()
   {
      AutomorphicNumber h = new AutomorphicNumber();

      int [] numbers = new int[1000];
      for (int k = 0; k < numbers.length; k++)
         numbers[k] = k+1;
      ArrayList<Integer> sol = new ArrayList<Integer>();
      sol.add(new Integer(1));
      sol.add(new Integer(5));
      sol.add(new Integer(6));
      sol.add(new Integer(25));
      sol.add(new Integer(76));
      sol.add(new Integer(376));
      sol.add(new Integer(625));
      assertEquals(sol, h.getAutomorphicNumberFromArray(numbers));
   }

   public void testAutomorphicNumber07()
   {
      AutomorphicNumber h = new AutomorphicNumber();
      assertEquals(true, h.isAutomorphicNumber(1));
      assertEquals(true, h.isAutomorphicNumber(5));
      assertEquals(true, h.isAutomorphicNumber(6));
      assertEquals(true, h.isAutomorphicNumber(25));
      assertEquals(true, h.isAutomorphicNumber(76));
      assertEquals(true, h.isAutomorphicNumber(376));
      assertEquals(true, h.isAutomorphicNumber(625));
      assertEquals(true, h.isAutomorphicNumber(9376));
      for (int k = 626; k < 9376; k++)
         assertEquals(false, h.isAutomorphicNumber(k));
   }

   public void testAutomorphicNumber08()
   {
      testAutomorphicNumber01();
      testAutomorphicNumber02();
      testAutomorphicNumber03();
   }

   public void testAutomorphicNumber09()
   {
      testAutomorphicNumber04();
      testAutomorphicNumber05();
      testAutomorphicNumber06();
   }

   public void testAutomorphicNumber10()
   {
      testAutomorphicNumber08();
      testAutomorphicNumber09();
   }

   public void testMoreFunctionsGoneWild00()
   {
      assertEquals(1499, MoreFunctionsGoneWild.f1(12));
      assertEquals(true, Math.abs(-939.40437 - MoreFunctionsGoneWild.f2(10)) < 0.05);
      assertEquals(true, Math.abs(19.26097 - MoreFunctionsGoneWild.f3(50, 1, 1)) < 0.05);
      assertEquals(true, Math.abs(0.0986123 - MoreFunctionsGoneWild.f4(1, 1)) < 0.05);
      assertEquals(true, Math.abs(1.41142 - MoreFunctionsGoneWild.f5(1, 2)) < 0.05);
      assertEquals(true, Math.abs(19.5191285 - MoreFunctionsGoneWild.f5(-1, 2)) < 0.05);
      assertEquals(true, Math.abs(1.066968 - MoreFunctionsGoneWild.f6(1., 2., 1.)) < 0.05);
      assertEquals(true, MoreFunctionsGoneWild.f7(false, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f8(false, true, false, true));
      assertEquals(true, Math.abs(75997.8079512 - MoreFunctionsGoneWild.f9(5.69, 2.37, 5.03, 0.85, 4.11)) < 0.05);
      assertEquals(false, MoreFunctionsGoneWild.f10(false, false, true, false));
   }

   public void testMoreFunctionsGoneWild01()
   {
      assertEquals(1499, MoreFunctionsGoneWild.f1(12));
      assertEquals(47245, MoreFunctionsGoneWild.f1(42));
      assertEquals(1345037, MoreFunctionsGoneWild.f1(100));
      assertEquals(818593, MoreFunctionsGoneWild.f1(111));
      assertEquals(19, MoreFunctionsGoneWild.f1(2));
   }

   public void testMoreFunctionsGoneWild02()
   {
      assertEquals(true, Math.abs(-939.40437 - MoreFunctionsGoneWild.f2(10)) < 0.05);
      assertEquals(true, Math.abs(211.8614934 - MoreFunctionsGoneWild.f2(-10)) < 0.05);
      assertEquals(true, Math.abs(26.807113 - MoreFunctionsGoneWild.f2(1)) < 0.05);
      assertEquals(true, Math.abs(-704276.2492 - MoreFunctionsGoneWild.f2(100)) < 0.05);
   }

   public void testMoreFunctionsGoneWild03()
   {
      assertEquals(true, Math.abs(19.26097 - MoreFunctionsGoneWild.f3(50, 1, 1)) < 0.05);
      assertEquals(true, Math.abs(7.680391 - MoreFunctionsGoneWild.f3(5, 1, 1)) < 0.05);
      assertEquals(true, Math.abs(-4.223858 - MoreFunctionsGoneWild.f3(5, -1, -1)) < 0.05);
      assertEquals(true, Math.abs(7809.42297 - MoreFunctionsGoneWild.f3(2.7327, -4.5, 3.1415)) < 0.05);
      assertEquals(true, Math.abs(10682259.44 - MoreFunctionsGoneWild.f3(1.414, -5.7, 4.256)) < 0.05);
   }

   public void testMoreFunctionsGoneWild04()
   {
      assertEquals(true, Math.abs(0.0986123 - MoreFunctionsGoneWild.f4(1, 1)) < 0.05);
      assertEquals(true, Math.abs(-19.7359 - MoreFunctionsGoneWild.f4(10, 5)) < 0.05);
      assertEquals(true, Math.abs(-164.163448 - MoreFunctionsGoneWild.f4(5, 10)) < 0.05);
      assertEquals(true, Math.abs(-20053.16399 - MoreFunctionsGoneWild.f4(25, 33)) < 0.05);
      assertEquals(true, Math.abs(-23183.0639 - MoreFunctionsGoneWild.f4(50, 33)) < 0.05);
      assertEquals(true, Math.abs(4.29330 - MoreFunctionsGoneWild.f4(50, 1)) < 0.05);
   }

   public void testMoreFunctionsGoneWild05()
   {
// a*b > 0
      assertEquals(true, Math.abs(1.41142 - MoreFunctionsGoneWild.f5(1, 2)) < 0.05);
      assertEquals(true, Math.abs(3.22583 - MoreFunctionsGoneWild.f5(10, 5)) < 0.05);
      assertEquals(true, Math.abs(7.34181 - MoreFunctionsGoneWild.f5(11, 33)) < 0.05);
// a*b <= 0
      assertEquals(true, Math.abs(19.5191285 - MoreFunctionsGoneWild.f5(-1, 2)) < 0.05);
      assertEquals(true, Math.abs(92.758692 - MoreFunctionsGoneWild.f5(-11, 33)) < 0.05);
      assertEquals(true, Math.abs(33.67750 - MoreFunctionsGoneWild.f5(-0.5, 8)) < 0.05);
      assertEquals(true, Math.abs(9.98877 - MoreFunctionsGoneWild.f5(1, -2)) < 0.05);
   }

   public void testMoreFunctionsGoneWild06()
   {
      assertEquals(true, Math.abs(1.066968 - MoreFunctionsGoneWild.f6(1., 2., 1.)) < 0.05);
      assertEquals(true, Math.abs(547169.2703172 - MoreFunctionsGoneWild.f6(7.29, 4.97, 3.55)) < 0.05);
      assertEquals(true, Math.abs(0.5510040 - MoreFunctionsGoneWild.f6(0.28, 0.43, 3.39)) < 0.05);
      assertEquals(true, Math.abs(-45.988369 - MoreFunctionsGoneWild.f6(2.0, 3.25, 3.29)) < 0.05);
   }

   public void testMoreFunctionsGoneWild07()
   {

      assertEquals(true, MoreFunctionsGoneWild.f7(false, false, false));
      assertEquals(false, MoreFunctionsGoneWild.f7(false, false, true));
      assertEquals(true, MoreFunctionsGoneWild.f7(false, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f7(false, true, true));

      assertEquals(false, MoreFunctionsGoneWild.f7(true, false, false));
      assertEquals(true, MoreFunctionsGoneWild.f7(true, false, true));
      assertEquals(false, MoreFunctionsGoneWild.f7(true, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f7(true, true, true));
   }

   public void testMoreFunctionsGoneWild08()
   {
      assertEquals(true, MoreFunctionsGoneWild.f8(false, false, false, false));
      assertEquals(false, MoreFunctionsGoneWild.f8(false, false, false, true));
      assertEquals(true, MoreFunctionsGoneWild.f8(false, false, true, false));
      assertEquals(false, MoreFunctionsGoneWild.f8(false, false, true, true));
      assertEquals(false, MoreFunctionsGoneWild.f8(false, true, false, false));
      assertEquals(true, MoreFunctionsGoneWild.f8(false, true, false, true));
      assertEquals(false, MoreFunctionsGoneWild.f8(false, true, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f8(false, true, true, true));
      
      assertEquals(true, MoreFunctionsGoneWild.f8(true, false, false, false));
      assertEquals(false, MoreFunctionsGoneWild.f8(true, false, false, true));
      assertEquals(false, MoreFunctionsGoneWild.f8(true, false, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f8(true, false, true, true));
      assertEquals(true, MoreFunctionsGoneWild.f8(true, true, false, false));
      assertEquals(true, MoreFunctionsGoneWild.f8(true, true, false, true));
      assertEquals(false, MoreFunctionsGoneWild.f8(true, true, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f8(true, true, true, true));
   }

   public void testMoreFunctionsGoneWild09()
   {
      assertEquals(true, Math.abs(75997.8079512 - MoreFunctionsGoneWild.f9(5.69, 2.37, 5.03, 0.85, 4.11)) < 0.05);
      assertEquals(true, Math.abs(4.018905065 - MoreFunctionsGoneWild.f9(1.4, -0.87, 7.56, 1.87, 7.3)) < 0.05);
      assertEquals(true, Math.abs(245.765731058 - MoreFunctionsGoneWild.f9(4.66, 5.96, 5.35, 1.92, 4.15)) < 0.05);
      assertEquals(true, Math.abs(24.58689632266175 - MoreFunctionsGoneWild.f9(3.55, -2.08, 6.91, 4.06, 7.42)) < 0.05);
   }

   public void testMoreFunctionsGoneWild10()
   {
      assertEquals(true, MoreFunctionsGoneWild.f10(false, false, false, false));
      assertEquals(true, MoreFunctionsGoneWild.f10(false, false, false, true));
      assertEquals(false, MoreFunctionsGoneWild.f10(false, false, true, false));
      assertEquals(false, MoreFunctionsGoneWild.f10(false, false, true, true));
      assertEquals(true, MoreFunctionsGoneWild.f10(false, true, false, false));
      assertEquals(true, MoreFunctionsGoneWild.f10(false, true, false, true));
      assertEquals(true, MoreFunctionsGoneWild.f10(false, true, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f10(false, true, true, true));
      
      assertEquals(true, MoreFunctionsGoneWild.f10(true, false, false, false));
      assertEquals(true, MoreFunctionsGoneWild.f10(true, false, false, true));
      assertEquals(false, MoreFunctionsGoneWild.f10(true, false, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f10(true, false, true, true));
      assertEquals(true, MoreFunctionsGoneWild.f10(true, true, false, false));
      assertEquals(true, MoreFunctionsGoneWild.f10(true, true, false, true));
      assertEquals(false, MoreFunctionsGoneWild.f10(true, true, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f10(true, true, true, true));
   }

   public void testCircle01()
   {
      Point a = new Point(2, 4);
      Point b = new Point(6, 8);
      Point c = new Point(12, 4);
      
      Circle ans = new Circle(a, b, c);
      Point cc = new Point(7., 3.);

      assertEquals(cc.getX(), ans.getCenter().getX());
      assertEquals(cc.getY(), ans.getCenter().getY());
      assertEquals(Math.sqrt(26.), ans.getRadius());
   }

   public void testCircle02()
   {
      Point a = new Point(2, 3);
      Point b = new Point(2, 9);
      Point c = new Point(14, 15);
      
      Circle ans = new Circle(a, b, c);
      Point cc = new Point(11., 6.);

      for (int k = 0; k < 3; k++)
      {
          assertEquals(cc.getX(), ans.getCenter().getX());
          assertEquals(cc.getY(), ans.getCenter().getY());
          assertEquals(Math.sqrt(90.), ans.getRadius());
      }

      a = new Point(3, 7);
      b = new Point(13, 21);
      c = new Point(13, -3);
      
      ans = new Circle(a, b, c);
      cc = new Point(15., 9.);

      boolean flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      assertEquals(cc.getY(), ans.getCenter().getY());
      flag = Math.abs( Math.sqrt(148.) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);
    }

   public void testCircle03()
   {
      Point a = new Point(-6, -6);
      Point b = new Point(0, 0);
      Point c = new Point(10, 0);
      
      Circle ans = new Circle(a, b, c);
      Point cc = new Point(5, -11);

      boolean flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      assertEquals(cc.getY(), ans.getCenter().getY());
      flag = Math.abs( Math.sqrt(146) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);

      a = new Point(0, 0);
      b = new Point(20, 0);
      c = new Point(40, -20);
      
      ans = new Circle(a, b, c);
      cc = new Point(10, -30.);

      flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      assertEquals(cc.getY(), ans.getCenter().getY());
      flag = Math.abs( Math.sqrt(1000.) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);
    }

    public void testCircle04()
   {
      Point a = new Point(3, 7);
      Point b = new Point(3, 21);
      Point c = new Point(13, 21);
      
      Circle ans = new Circle(a, b, c);
      Point cc = new Point(8, 14);

      boolean flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      assertEquals(cc.getY(), ans.getCenter().getY());
      flag = Math.abs( Math.sqrt(25.+49) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);

      a = new Point(3, 27);
      b = new Point(23, 27);
      c = new Point(23, 43);
      
      ans = new Circle(a, b, c);
      cc = new Point(13, 35.);

      flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      assertEquals(cc.getY(), ans.getCenter().getY());
      flag = Math.abs( Math.sqrt(164.) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);
   }

   public void testCircle05()
   {
      Point a = new Point(-2, -7);
      Point b = new Point(4, -12);
      Point c = new Point(14, -8);
      
      Circle ans = new Circle(a, b, c);
      Point cc = new Point(232./37, -235/74.);

      boolean flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      flag = Math.abs(cc.getY() - ans.getCenter().getY()) < 0.0002;
      assertEquals(true, flag);
      flag = Math.abs( Math.sqrt(454633./5476) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);

      a = new Point(11, 40);
      b = new Point(31, 22);
      c = new Point(87, 66);
      
      ans = new Circle(a, b, c);
      cc = new Point(11031./236, 7033./118);

      flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      assertEquals(cc.getY(), ans.getCenter().getY());
      flag = Math.abs( Math.sqrt(1661.683) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);
    }

   public void testCircle06()
   {
      Point a = new Point(-50, -40);
      Point b = new Point(-30, -10);
      Point c = new Point(-10, -50);
      
      Circle ans = new Circle(a, b, c);
      Point cc = new Point(-190./7, -235/7.);

      boolean flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      flag = Math.abs(cc.getY() - ans.getCenter().getY()) < 0.0002;
      assertEquals(true, flag);
      flag = Math.abs( Math.sqrt(563.7755) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);

      a = new Point(-100, 25);
      b = new Point(30, 31);
      c = new Point(20, -55);
      
      ans = new Circle(a, b, c);
      cc = new Point(-4652./139, -2169./417);

      flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      assertEquals(cc.getY(), ans.getCenter().getY());
      flag = Math.abs( Math.sqrt(5338.683712) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);
    }

   public void testCircle07()
   {
      Point a = new Point(-50, 201);
      Point b = new Point(-200, -175);
      Point c = new Point(-26, -100);
      
      Circle ans = new Circle(a, b, c);
      Point cc = new Point(-1705127./9029, 38.47208993);

      boolean flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      flag = Math.abs(cc.getY() - ans.getCenter().getY()) < 0.0002;
      assertEquals(true, flag);
      flag = Math.abs( Math.sqrt(45694.65482) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);

      a = new Point(300, 500);
      b = new Point(700, 700);
      c = new Point(50, 200);
      
      ans = new Circle(a, b, c);
      cc = new Point(6625./7, -2050./7);

      flag = Math.abs(cc.getX() - ans.getCenter().getX()) < 0.0002;
      assertEquals(true, flag);
      flag = Math.abs(cc.getY() - ans.getCenter().getY()) < 0.0002;
      assertEquals(true, flag);
      flag = Math.abs( Math.sqrt(1046492.347) - ans.getRadius()) < 0.0002;
      assertEquals(true, flag);
    }

   public void testCircle08()
   {
      Point a = new Point(-50, 0);
      Point b = new Point(-200, 0);
      Point c = new Point(-26, 0);
      
      Circle ans = new Circle(a, b, c);
      Point cc = null;

      boolean flag = (cc == null);
      assertEquals(true, flag);
      assertEquals(-1., ans.getRadius());

      for (int k = 1; k < 1005; k = k + 200)
      {
          a = new Point(-1000, -500);
          b = new Point(-1000 + 2 * k, -500 + 2 * k);
          c = new Point(-1000 + 4 * k, -500 + 4 * k);
          
          ans = new Circle(a, b, c);
          cc = null;
    
          flag = ( cc == null);
          assertEquals(true, flag);
          assertEquals(-1., ans.getRadius());
      }
   }

   public void testCircle09()
   {
      testCircle01();
      testCircle02();
      testCircle03();
      testCircle04();
      testCircle05();
   }

   public void testCircle10()
   {
      testCircle06();
      testCircle07();
      testCircle08();
      testCircle09();
   }

      public void testGameSet01()
   {
      Card c1 = new Card (1, "square" , "red", "clear");
      Card c2 = new Card (2, "square" , "red", "clear");
      Card c3 = new Card (3, "square" , "red", "clear");
      Card c4 = new Card (1, "square" , "blue", "clear");

      assertEquals(true, GameSet.isSet(c1, c2, c3));
      assertEquals(false, GameSet.isSet(c1, c2, c4));

      assertEquals(c3, GameSet.makeSet(c1, c2));

      Card[] temp = {  new Card(2, "square", "red", "dashed"),
                        new Card(2, "circle", "green", "dashed"),
                        new Card(3, "square", "red", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(2, "triangle", "green", "clear"),
                        new Card(3, "square", "blue", "dashed"),
                        new Card(1, "square", "blue", "dashed"),
                        new Card(3, "circle", "red", "clear"),
                        new Card(1, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "clear"),
                        new Card(3, "triangle", "green", "clear"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "square", "green", "clear"),
                        new Card(1, "square", "green", "clear") };
      assertEquals(false, GameSet.containsSet(temp));

      Card[] temp1 = {  new Card(2, "square", "red", "dashed"),
                        new Card(2, "circle", "green", "dashed"),
                        new Card(3, "square", "red", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(2, "triangle", "green", "clear"),
                        new Card(3, "square", "blue", "dashed"),
                        new Card(1, "square", "blue", "dashed"),
                        new Card(3, "square", "red", "clear"),
                        new Card(1, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "clear"),
                        new Card(3, "triangle", "green", "clear"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "square", "green", "clear"),
                        new Card(1, "square", "green", "clear") };
      assertEquals(true, GameSet.containsSet(temp1));
   }

   public void testGameSet02()   //  isSet tester only
   {
      Card c1 = new Card (1, "square" , "red", "clear");
      Card c2 = new Card (2, "circle" , "blue", "solid");
      Card c3 = new Card (3, "triangle" , "green", "dashed");

      Card c4 = new Card (1, "square" , "blue", "clear");

      Card c5 = new Card (2, "circle" , "blue", "clear");
      Card c6 = new Card (3, "triangle" , "green", "clear");

      Card c7 = new Card (2, "circle" , "red", "solid");
      Card c8 = new Card (3, "triangle" , "red", "dashed");

      Card c9 = new Card (2, "circle" , "red", "clear");
      Card c10 = new Card (3, "triangle" , "red", "clear");

      Card c11 = new Card (2, "square" , "blue", "solid");
      Card c12 = new Card (3, "square" , "green", "dashed");

      Card c13 = new Card (2, "square" , "blue", "clear");
      Card c14 = new Card (3, "square" , "green", "clear");

      Card c15 = new Card (2, "square" , "red", "solid");
      Card c16 = new Card (3, "square" , "red", "dashed");

      Card c17 = new Card (2, "square" , "red", "clear");
      Card c18 = new Card (3, "square" , "red", "clear");

      Card c22 = new Card (1, "circle" , "blue", "solid");
      Card c23 = new Card (1, "triangle" , "green", "dashed");

      Card c25 = new Card (1, "circle" , "blue", "clear");
      Card c26 = new Card (1, "triangle" , "green", "clear");

      Card c27 = new Card (1, "circle" , "red", "solid");
      Card c28 = new Card (1, "triangle" , "red", "dashed");

      Card c29 = new Card (1, "circle" , "red", "clear");
      Card c30 = new Card (1, "triangle" , "red", "clear");

      Card c31 = new Card (1, "square" , "blue", "solid");
      Card c32 = new Card (1, "square" , "green", "dashed");

      Card c33 = new Card (1, "square" , "blue", "clear");
      Card c34 = new Card (1, "square" , "green", "clear");

      Card c35 = new Card (1, "square" , "red", "solid");
      Card c36 = new Card (1, "square" , "red", "dashed");

      assertEquals(true, GameSet.isSet(c1, c2, c3));  //  diff - diff - diff - diff
      assertEquals(true, GameSet.isSet(c1, c5, c6));  //  diff - diff - diff - same
      assertEquals(true, GameSet.isSet(c1, c7, c8));  //  diff - diff - same - diff
      assertEquals(true, GameSet.isSet(c1, c9, c10));  // diff - diff - same - same
      assertEquals(true, GameSet.isSet(c1, c11, c12));  // diff - same - diff - diff
      assertEquals(true, GameSet.isSet(c1, c13, c14));  // diff - same - diff - same
      assertEquals(true, GameSet.isSet(c1, c15, c16));  // diff - same - same - diff
      assertEquals(true, GameSet.isSet(c1, c17, c18));  // diff - same - same - same

      assertEquals(true, GameSet.isSet(c1, c22, c23));  //  same - diff - diff - diff
      assertEquals(true, GameSet.isSet(c1, c25, c26));  //  same - diff - diff - same
      assertEquals(true, GameSet.isSet(c1, c27, c28));  //  same - diff - same - diff
      assertEquals(true, GameSet.isSet(c1, c29, c30));  // same - diff - same - same
      assertEquals(true, GameSet.isSet(c1, c31, c32));  // same - same - diff - diff
      assertEquals(true, GameSet.isSet(c1, c33, c34));  // same - same - diff - same
      assertEquals(true, GameSet.isSet(c1, c35, c36));  // same - same - same - diff

      assertEquals(false, GameSet.isSet(c1, c2, c4));
      assertEquals(false, GameSet.isSet(c3, c2, c4));
      assertEquals(false, GameSet.isSet(c1, c3, c4));
   }

   public void testGameSet03()   //  more isSet tester only
   {
      Card c1 = new Card (2, "square" , "red", "clear");
      Card c2 = new Card (2, "circle" , "blue", "solid");
      Card c3 = new Card (2, "triangle" , "green", "dashed");

      Card c4 = new Card (3, "square" , "red", "dashed");
      Card c5 = new Card (3, "circle" , "blue", "dashed");
      Card c6 = new Card (3, "triangle" , "green", "dashed");

      Card c7 = new Card (1, "circle" , "red", "solid");
      Card c8 = new Card (2, "circle" , "red", "dashed");
      Card c9 = new Card (3, "circle" , "red", "clear");

      Card c10 = new Card (3, "square" , "green", "solid");
      Card c11 = new Card (2, "square" , "green", "solid");
      Card c12 = new Card (1, "square" , "green", "solid");

      Card c13 = new Card (2, "square" , "blue", "dashed");
      Card c14 = new Card (3, "square" , "green", "clear");
      Card c15 = new Card (2, "square" , "red", "solid");

      Card c16 = new Card (3, "square" , "blue", "dashed");
      Card c17 = new Card (2, "circle" , "red", "clear");
      Card c18 = new Card (1, "square" , "green", "solid");

      Card c19 = new Card (1, "circle" , "blue", "solid");
      Card c20 = new Card (1, "triangle" , "green", "dashed");
      Card c21 = new Card (1, "circle" , "blue", "clear");

      Card c22 = new Card (2, "triangle" , "blue", "solid");
      Card c23 = new Card (1, "triangle" , "blue", "dashed");
      Card c24 = new Card (3, "triangle" , "blue", "solid");

      Card c25 = new Card (1, "triangle" , "green", "clear");
      Card c26 = new Card (1, "circle" , "red", "solid");
      Card c27 = new Card (2, "triangle" , "blue", "dashed");

      Card c28 = new Card (1, "square" , "red", "dashed");
      Card c29 = new Card (1, "circle" , "red", "clear");
      Card c30 = new Card (1, "triangle" , "red", "clear");

      Card c31 = new Card (2, "square" , "blue", "solid");
      Card c32 = new Card (2, "square" , "green", "dashed");
      Card c33 = new Card (2, "square" , "blue", "clear");

      Card c34 = new Card (3, "square" , "green", "clear");
      Card c35 = new Card (3, "square" , "red", "solid");
      Card c36 = new Card (3, "square" , "red", "dashed");

      assertEquals(true, GameSet.isSet(c1, c2, c3));     //  same(2) - diff - diff - diff
      assertEquals(true, GameSet.isSet(c4, c5, c6));     //  same(3) - diff - diff - same(dahsed)
      assertEquals(true, GameSet.isSet(c9, c7, c8));     //  diff - same(circle) - same(red) - diff
      assertEquals(true, GameSet.isSet(c11, c12, c10));  // diff - same(square) - same(green) - same(solid)

      assertEquals(false, GameSet.isSet(c13, c14, c15));  // BAD - same - diff - diff
      assertEquals(false, GameSet.isSet(c18, c17, c16));  // diff - BAD - diff - same
      assertEquals(false, GameSet.isSet(c21, c20, c19));  // same - diff - BAD - diff
      assertEquals(false, GameSet.isSet(c22, c23, c24));  // diff - same - same - BAD

      assertEquals(false, GameSet.isSet(c25, c26, c27));
      assertEquals(false, GameSet.isSet(c30, c29, c28));
      assertEquals(false, GameSet.isSet(c31, c32, c33));

      assertEquals(false, GameSet.isSet(c34, c35, c36));
   }

   public void testGameSet04()   //  makeSet tester only
   {
      Card c1 = new Card (1, "square" , "red", "clear");
      Card c2 = new Card (2, "circle" , "blue", "solid");
      Card c3 = new Card (3, "triangle" , "green", "dashed");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // diff - diff - diff - diff

      c1 = new Card (3, "square" , "red", "clear");
      c2 = new Card (1, "circle" , "blue", "clear");
      c3 = new Card (2, "triangle" , "green", "clear");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // diff - diff - diff - same

      c1 = new Card (3, "square" , "green", "solid");
      c2 = new Card (1, "circle" , "green", "dashed");
      c3 = new Card (2, "triangle" , "green", "clear");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // diff - diff - same - diff

      c1 = new Card (3, "square" , "green", "dashed");
      c2 = new Card (1, "circle" , "green", "dashed");
      c3 = new Card (2, "triangle" , "green", "dashed");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // diff - diff - same - same

      c1 = new Card (3, "triangle" , "green", "dashed");
      c2 = new Card (1, "triangle" , "blue", "clear");
      c3 = new Card (2, "triangle" , "red", "solid");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // diff - same - diff - diff

      c1 = new Card (3, "circle" , "green", "solid");
      c2 = new Card (1, "circle" , "blue", "solid");
      c3 = new Card (2, "circle" , "red", "solid");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // diff - same - diff - same

      c1 = new Card (2, "circle" , "red", "solid");
      c2 = new Card (3, "circle" , "red", "dashed");
      c3 = new Card (1, "circle" , "red", "clear");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // diff - same - same - diff

      c1 = new Card (2, "circle" , "red", "clear");
      c2 = new Card (3, "circle" , "red", "clear");
      c3 = new Card (1, "circle" , "red", "clear");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // diff - same - same - same
    }

   public void testGameSet05()   //  more makeSet tester only
   {
      Card c1 = new Card (3, "square" , "red", "clear");
      Card c2 = new Card (3, "circle" , "blue", "solid");
      Card c3 = new Card (3, "triangle" , "green", "dashed");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // same - diff - diff - diff

      c1 = new Card (2, "square" , "red", "clear");
      c2 = new Card (2, "circle" , "blue", "clear");
      c3 = new Card (2, "triangle" , "green", "clear");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // same - diff - diff - same

      c1 = new Card (1, "square" , "green", "solid");
      c2 = new Card (1, "circle" , "green", "dashed");
      c3 = new Card (1, "triangle" , "green", "clear");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // same - diff - same - diff

      c1 = new Card (1, "square" , "green", "dashed");
      c2 = new Card (1, "circle" , "green", "dashed");
      c3 = new Card (1, "triangle" , "green", "dashed");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // same - diff - same - same

      c1 = new Card (2, "triangle" , "green", "dashed");
      c2 = new Card (2, "triangle" , "blue", "clear");
      c3 = new Card (2, "triangle" , "red", "solid");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // same - same - diff - diff

      c1 = new Card (3, "circle" , "green", "solid");
      c2 = new Card (3, "circle" , "blue", "solid");
      c3 = new Card (3, "circle" , "red", "solid");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // same - same - diff - same

      c1 = new Card (1, "circle" , "red", "solid");
      c2 = new Card (1, "circle" , "red", "dashed");
      c3 = new Card (1, "circle" , "red", "clear");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // same - same - same - diff

      c1 = new Card (2, "circle" , "red", "clear");
      c2 = new Card (2, "circle" , "red", "clear");
      c3 = new Card (2, "circle" , "red", "clear");
      assertEquals(c3, GameSet.makeSet(c1, c2));   // same - same - same - same
    }

   public void testGameSet06()   //  containsSet tester only
   {
      Card[] temp = {   new Card(1, "triangle", "red", "solid"),
                        new Card(3, "circle", "green", "dashed"),
                        new Card(2, "square", "blue", "clear"),
                        new Card(2, "triangle", "red", "clear"),
                        new Card(1, "circle", "green", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(3, "circle", "green", "dashed"),
                        new Card(1, "square", "red", "clear"),
                        new Card(3, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "dashed"),
                        new Card(2, "circle", "red", "clear"),
                        new Card(3, "square", "red", "solid"),
                        new Card(1, "triangle", "blue", "dashed"),
                        new Card(2, "square", "green", "clear"),
                        new Card(3, "triangle", "blue", "solid") };
      assertEquals(true, GameSet.containsSet(temp));

      Card[] temp1 = {   new Card(2, "cirlce", "red", "solid"),
                        new Card(2, "circle", "green", "dashed"),
                        new Card(2, "circle", "red", "dashed"),
                        new Card(1, "circle", "blue", "clear"),

                        new Card(3, "square", "blue", "solid"),
                        new Card(1, "square", "red", "clear"),
                        new Card(3, "circle", "green", "clear"),
                        new Card(2, "circle", "red", "dashed"),

                        new Card(3, "square", "red", "dashed"),
                        new Card(1, "square", "green", "solid"),
                        new Card(2, "square", "green", "solid"),
                        new Card(2, "circle", "green", "dashed"),
                        
                        new Card(3, "circle", "green", "clear"),
                        new Card(2, "circle", "green", "clear"),
                        new Card(2, "square", "red", "dashed") };
      assertEquals(false, GameSet.containsSet(temp1));

      
      Card[] temp2 = {   new Card(2, "circle", "red", " solid"),
                         new Card(2, "circle", "green", " dashed"),
                         new Card(2, "circle", "red", " dashed"),
                         new Card(1, "circle", "blue", " clear"),

                         new Card(3, "square", "blue", " solid"),
                         new Card(1, "square", "red", " clear"),
                         new Card(3, "circle", "green", " clear"),
                         new Card(2, "circle", "red", " dashed"),

                         new Card(3, "square", "red", " dashed"),
                         new Card(1, "square", "green", " solid"),
                         new Card(2, "square", "green", " solid"),
                         new Card(2, "circle", "green", " dashed"),

                         new Card(3, "circle", "green", " clear"),
                         new Card(2, "circle", "green", " clear"),
                         new Card(2, "square", "red", " dashed") };
      assertEquals(false, GameSet.containsSet(temp2));

      Card[] temp3 = {   new Card(3, "square", "red", "solid"),
                         new Card(2, "square", "blue", "dashed"),
                         new Card(2, "circle", "blue", "solid"),
                         new Card(2, "circle", "blue", "clear"),
                         new Card(2, "triangle", "blue", "dashed"),
                         new Card(2, "circle", "blue", "solid"),
                         new Card(2, "triangle", "blue", "dashed"),
                         new Card(3, "triangle", "red", "dashed"),
                         new Card(3, "square", "red", "clear"),
                         new Card(3, "circle", "red", "dashed"),
                         new Card(3, "circle", "blue", "clear"),
                         new Card(3, "circle", "blue", "solid"),
                         new Card(1, "square", "blue", "dashed"),
                         new Card(1, "circle", "red", "dashed"),
                         new Card(3, "square", "red", "solid") };

      assertEquals(false, GameSet.containsSet(temp3));
   }

   public void testGameSet07()   //  isSet and makeSet
   {
       testGameSet02();
       testGameSet03();
       testGameSet04();
       testGameSet05();
   }

   public void testGameSet08()   //  isSet and containsSet
   {
       testGameSet02();
       testGameSet03();
       testGameSet06();
   }

   public void testGameSet09()   //  makeSet and containsSet
   {
       testGameSet04();
       testGameSet05();
       testGameSet06();
   }

   public void testGameSet10()   //  isSet and makeSet and containsSet
   {
       testGameSet02();
       testGameSet03();
       testGameSet04();
       testGameSet05();
       testGameSet06();

      Card[] temp = {   new Card(1, "circle", "green", "clear"),
                         new Card(2, "triangle", "green", "solid"),
                         new Card(1, "circle", "red", "solid"),
                         new Card(3, "square", "green", "solid"),
                         new Card(3, "triangle", "green", "clear"),
                         new Card(2, "circle", "green", "solid"),
                         new Card(1, "square", "red", "solid"),
                         new Card(1, "circle", "red", "solid"),
                         new Card(3, "circle", "green", "clear"),
                         new Card(1, "square", "red", "solid"),
                         new Card(1, "triangle", "red", "dashed"),
                         new Card(3, "circle", "green", "clear"),
                         new Card(3, "triangle", "red", "dashed"),
                         new Card(2, "triangle", "red", "clear"),
                         new Card(1, "square", "green", "solid") };

      assertEquals(false, GameSet.containsSet(temp));


      Card[] temp1 = {   new Card(1, "circle", "green", "clear"),
                         new Card(2, "triangle", "green", "solid"),
                         new Card(1, "circle", "red", "solid"),
                         new Card(3, "square", "green", "solid"),
                         new Card(3, "triangle", "green", "clear"),
                         new Card(2, "circle", "green", "solid"),
                         new Card(1, "square", "red", "solid"),
                         new Card(1, "triangle", "red", "dashed"),
                         new Card(3, "circle", "green", "clear"),
                         new Card(3, "triangle", "red", "dashed"),
                         new Card(2, "triangle", "red", "clear"),
                         new Card(1, "square", "green", "solid") };

      assertEquals(false, GameSet.containsSet(temp1));

      Card[] temp2 = {   new Card(1, "circle", "green", "clear"),
                         new Card(2, "triangle", "green", "solid"),
                         new Card(1, "circle", "red", "solid"),
                         new Card(3, "square", "green", "solid"),
                         new Card(1, "triangle", "red", "dashed"),
                         new Card(3, "circle", "green", "clear"),
                         new Card(3, "triangle", "red", "dashed"),
                         new Card(2, "triangle", "red", "clear"),
                         new Card(1, "square", "green", "solid") };

      assertEquals(false, GameSet.containsSet(temp2));

      Card[] temp3 = {   new Card(1, "circle", "green", "clear"),
                         new Card(2, "triangle", "green", "solid"),
                         new Card(1, "circle", "red", "solid"),
                         new Card(3, "square", "green", "solid"),
                         new Card(1, "triangle", "red", "dashed"),
                         new Card(3, "circle", "green", "clear"),
                         new Card(3, "triangle", "red", "dashed"),
                         new Card(3, "square", "green", "dashed"),
                         new Card(2, "triangle", "red", "clear"),
                         new Card(1, "square", "green", "solid") };

      assertEquals(true, GameSet.containsSet(temp3));
    }

    public void testPowerSquare01()
   {
      PowerSquare sq = new PowerSquare(3);
      sq.swapZeroDown();
      sq.swapZeroRight();

      int[] ans = sq.getFourPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(1));
      temp.add(new Integer(5));
      temp.add(new Integer(4));
      temp.add(new Integer(7));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.length, temp.size());
      for (int j = 0; j < ans.length; j++)
      {
         assertEquals(true, temp.contains(ans[j]));
         s.add(ans[j]);
      }
      assertEquals(ans.length, s.size());

      ArrayList<Integer> ansl = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(1));
      temp.add(new Integer(5));
      temp.add(new Integer(4));
      temp.add(new Integer(7));
      temp.add(new Integer(3));
      temp.add(new Integer(2));
      temp.add(new Integer(6));
      temp.add(new Integer(8));

      s = new HashSet<Integer>();
      assertEquals(ansl.size(), temp.size());
      for (int j = 0; j < ans.length; j++)
      {
         assertEquals(true, temp.contains(ansl.get(j)));
         s.add(ansl.get(j));
      }
      assertEquals(ans.length, s.size());
   }

   public void testPowerSquare02()    // test all methods
   {
      PowerSquare sq = new PowerSquare(3);

      ArrayList<Integer> ans = sq.getEightPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(3));
      temp.add(new Integer(1));
      temp.add(new Integer(4));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      sq = new PowerSquare(3);
      sq.shiftZeroRight();
      sq.shiftZeroUp();
      sq.shiftZeroRight();
      sq.swapZeroRight();

      int[] arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(3));
      temp.add(new Integer(6));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(6));
      temp.add(new Integer(7));
      temp.add(new Integer(3));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      sq.shiftZeroDown();
      sq.shiftZeroLeft();
      sq.shiftZeroUp();
      sq.swapZeroLeft();
      sq.swapZeroLeft();

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(3));
      temp.add(new Integer(2));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(7));
      temp.add(new Integer(2));
      temp.add(new Integer(3));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      sq.swapZeroDown();
      sq.swapZeroLeft();
      sq.swapZeroUp();
      sq.swapZeroRight();
      sq.swapZeroUp();
      sq.swapZeroRight();
      sq.swapZeroDown();
      sq.shiftZeroUp();
 
      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(1));
      temp.add(new Integer(3));
      temp.add(new Integer(7));
      temp.add(new Integer(8));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(1));
      temp.add(new Integer(2));
      temp.add(new Integer(3));
      temp.add(new Integer(4));
      temp.add(new Integer(5));
      temp.add(new Integer(6));
      temp.add(new Integer(7));
      temp.add(new Integer(8));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());
    }

   public void testPowerSquare03()   //  test swaps
   {
      PowerSquare sq = new PowerSquare(4);

      ArrayList<Integer> ans = sq.getEightPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(1));
      temp.add(new Integer(4));
      temp.add(new Integer(5));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      sq.swapZeroUp();
      sq.swapZeroLeft();
      sq.swapZeroDown();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(2));
      temp.add(new Integer(6));
      temp.add(new Integer(7));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      int[] arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(2));
      temp.add(new Integer(7));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.swapZeroLeft();
      sq.swapZeroDown();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(1));
      temp.add(new Integer(6));
      temp.add(new Integer(2));
      temp.add(new Integer(7));
      temp.add(new Integer(10));
      temp.add(new Integer(11));
      temp.add(new Integer(9));
      temp.add(new Integer(5));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(6));
      temp.add(new Integer(10));
      temp.add(new Integer(5));
      temp.add(new Integer(7));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.swapZeroRight();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(6));
      temp.add(new Integer(2));
      temp.add(new Integer(7));
      temp.add(new Integer(10));
      temp.add(new Integer(11));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(2));
      temp.add(new Integer(7));
      temp.add(new Integer(11));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());
   }

   public void testPowerSquare04()    //  test swaps
   {
      PowerSquare sq = new PowerSquare(5);
      sq.swapZeroRight();
      sq.swapZeroRight();

      ArrayList<Integer> ans = sq.getEightPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(2));
      temp.add(new Integer(3));
      temp.add(new Integer(6));
      temp.add(new Integer(7));
      temp.add(new Integer(8));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      int[] arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(3));
      temp.add(new Integer(2));
      temp.add(new Integer(7));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.swapZeroUp();
      sq.swapZeroUp();
      sq.swapZeroUp();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(11));
      temp.add(new Integer(13));
      temp.add(new Integer(16));
      temp.add(new Integer(18));
      temp.add(new Integer(12));
      temp.add(new Integer(6));
      temp.add(new Integer(7));
      temp.add(new Integer(8));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(7));
      temp.add(new Integer(11));
      temp.add(new Integer(13));
      temp.add(new Integer(12));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.swapZeroLeft();
      sq.swapZeroUp();
      sq.swapZeroLeft();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(1));
      temp.add(new Integer(2));
      temp.add(new Integer(5));
      temp.add(new Integer(6));
      temp.add(new Integer(10));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(10));
      temp.add(new Integer(1));
      temp.add(new Integer(5));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());
   }

   public void testPowerSquare05()    //   shifts only
   {
      PowerSquare sq = new PowerSquare(6);
      sq.shiftZeroUp();
      sq.shiftZeroUp();

      ArrayList<Integer> ans = sq.getEightPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(30));
      temp.add(new Integer(19));
      temp.add(new Integer(25));
      temp.add(new Integer(31));
      temp.add(new Integer(6));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      int[] arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(30));
      temp.add(new Integer(25));
      temp.add(new Integer(6));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.shiftZeroLeft();
      sq.shiftZeroUp();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(23));
      temp.add(new Integer(16));
      temp.add(new Integer(22));
      temp.add(new Integer(29));
      temp.add(new Integer(35));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(23));
      temp.add(new Integer(22));
      temp.add(new Integer(35));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.shiftZeroRight();
      sq.shiftZeroRight();
      sq.shiftZeroDown();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(22));
      temp.add(new Integer(13));
      temp.add(new Integer(30));
      temp.add(new Integer(25));
      temp.add(new Integer(27));
      temp.add(new Integer(6));
      temp.add(new Integer(26));
      temp.add(new Integer(32));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(13));
      temp.add(new Integer(25));
      temp.add(new Integer(27));
      temp.add(new Integer(26));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());
   }

   public void testPowerSquare06()    //    shifts only
   {
      PowerSquare sq = new PowerSquare(5);
      sq.shiftZeroRight();
      sq.shiftZeroUp();

      ArrayList<Integer> ans = sq.getEightPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(15));
      temp.add(new Integer(21));
      temp.add(new Integer(17));
      temp.add(new Integer(20));
      temp.add(new Integer(22));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      int[] arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(21));
      temp.add(new Integer(20));
      temp.add(new Integer(22));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.shiftZeroLeft();
      sq.shiftZeroLeft();
      sq.shiftZeroLeft();
      sq.shiftZeroUp();
      sq.shiftZeroLeft();
      sq.shiftZeroDown();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(17));
      temp.add(new Integer(12));
      temp.add(new Integer(19));
      temp.add(new Integer(24));
      temp.add(new Integer(2));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(12));
      temp.add(new Integer(2));
      temp.add(new Integer(24));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.shiftZeroUp();
      sq.shiftZeroUp();
      sq.shiftZeroLeft();
      sq.shiftZeroDown();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(16));
      temp.add(new Integer(11));
      temp.add(new Integer(18));
      temp.add(new Integer(21));
      temp.add(new Integer(20));
      temp.add(new Integer(23));
      temp.add(new Integer(17));
      temp.add(new Integer(1));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(11));
      temp.add(new Integer(21));
      temp.add(new Integer(20));
      temp.add(new Integer(17));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.shiftZeroUp();
      sq.shiftZeroRight();
      sq.shiftZeroDown();
      sq.shiftZeroLeft();

      ans = sq.getEightPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(10));
      temp.add(new Integer(16));
      temp.add(new Integer(12));
      temp.add(new Integer(17));
      temp.add(new Integer(19));
      temp.add(new Integer(23));
      temp.add(new Integer(24));
      temp.add(new Integer(20));

      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      arrAns = sq.getFourPossibleNeighbors();
      temp = new ArrayList<Integer>();
      temp.add(new Integer(16));
      temp.add(new Integer(17));
      temp.add(new Integer(19));
      temp.add(new Integer(24));

      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());
   }

   public void testPowerSquare07()
   {
      testPowerSquare01();
      testPowerSquare02();
   }

   public void testPowerSquare08()
   {
      testPowerSquare03();
      testPowerSquare04();
   }

   public void testPowerSquare09()
   {
      testPowerSquare05();
      testPowerSquare06();
   }

   public void testPowerSquare10()
   {
      testPowerSquare07();
      testPowerSquare08();
      testPowerSquare09();
   }

   public void testPowerSquare11()    //    shift get four
   {
      PowerSquare sq = new PowerSquare(4);
      sq.shiftZeroRight();
      sq.shiftZeroDown();
      sq.shiftZeroRight();
      sq.shiftZeroDown();
      sq.shiftZeroLeft();
      sq.shiftZeroUp();

      int[] arrAns = sq.getFourPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(4));
      temp.add(new Integer(7));
      temp.add(new Integer(1));
      temp.add(new Integer(9));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

      sq.shiftZeroRight();
      sq.shiftZeroRight();
      sq.shiftZeroRight();
      sq.shiftZeroRight();
      sq.shiftZeroUp();
      sq.shiftZeroUp();
      sq.shiftZeroUp();
      sq.shiftZeroUp();
      sq.shiftZeroLeft();
      sq.shiftZeroLeft();
      sq.shiftZeroLeft();
      sq.shiftZeroLeft();
      sq.shiftZeroDown();
      sq.shiftZeroDown();
      sq.shiftZeroDown();
      sq.shiftZeroDown();

      sq.getFourPossibleNeighbors();

      arrAns = sq.getFourPossibleNeighbors();
      s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());
   }

   public void testPowerSquare12()    //    shift get eight
   {
      PowerSquare sq = new PowerSquare(4);
      sq.shiftZeroRight();
      sq.shiftZeroDown();
      sq.shiftZeroRight();
      sq.shiftZeroDown();
      sq.shiftZeroLeft();
      sq.shiftZeroUp();

      ArrayList<Integer> ans = sq.getEightPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(4));
      temp.add(new Integer(7));
      temp.add(new Integer(1));
      temp.add(new Integer(9));
      temp.add(new Integer(14));
      temp.add(new Integer(3));
      temp.add(new Integer(11));
      temp.add(new Integer(5));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());

      sq.shiftZeroRight();
      sq.shiftZeroRight();
      sq.shiftZeroRight();
      sq.shiftZeroRight();
      sq.shiftZeroUp();
      sq.shiftZeroUp();
      sq.shiftZeroUp();
      sq.shiftZeroUp();
      sq.shiftZeroLeft();
      sq.shiftZeroLeft();
      sq.shiftZeroLeft();
      sq.shiftZeroLeft();
      sq.shiftZeroDown();
      sq.shiftZeroDown();
      sq.shiftZeroDown();
      sq.shiftZeroDown();

      sq.getFourPossibleNeighbors();

      ans = sq.getEightPossibleNeighbors();
      s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());
   }

   public void testPowerSquare13()    //    swap get four
   {
      PowerSquare sq = new PowerSquare(10);
      sq.swapZeroDown();
      sq.swapZeroDown();
      sq.swapZeroDown();
      sq.swapZeroRight();
      sq.swapZeroRight();
      sq.swapZeroRight();
      sq.swapZeroRight();
      sq.swapZeroDown();
      sq.swapZeroRight();
      sq.swapZeroDown();
      sq.swapZeroRight();
      
      sq.swapZeroDown();
      sq.swapZeroLeft();
      sq.swapZeroDown();
      sq.swapZeroLeft();

      sq.swapZeroUp();
      sq.swapZeroUp();
      sq.swapZeroUp();
      sq.swapZeroUp();

      sq.swapZeroRight();
      sq.swapZeroUp();
      sq.swapZeroLeft();
      sq.swapZeroUp();
      sq.swapZeroLeft();

      int[] arrAns = sq.getFourPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(3));
      temp.add(new Integer(12));
      temp.add(new Integer(13));
      temp.add(new Integer(23));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(arrAns.length, temp.size());
      for (int j = 0; j < arrAns.length; j++)
      {
         assertEquals(true, temp.contains(arrAns[j]));
         s.add(arrAns[j]);
      }
      assertEquals(arrAns.length, s.size());

   }

   public void testPowerSquare14()    //    swap get eight
   {
      PowerSquare sq = new PowerSquare(10);
      sq.swapZeroDown();
      sq.swapZeroDown();
      sq.swapZeroDown();
      sq.swapZeroRight();
      sq.swapZeroRight();
      sq.swapZeroRight();
      sq.swapZeroRight();
      sq.swapZeroDown();
      sq.swapZeroRight();
      sq.swapZeroDown();
      sq.swapZeroRight();
      
      sq.swapZeroDown();
      sq.swapZeroLeft();
      sq.swapZeroDown();
      sq.swapZeroLeft();

      sq.swapZeroUp();
      sq.swapZeroUp();
      sq.swapZeroUp();
      sq.swapZeroUp();

      sq.swapZeroRight();
      sq.swapZeroUp();
      sq.swapZeroLeft();
      sq.swapZeroUp();
      sq.swapZeroLeft();

      ArrayList<Integer> ans = sq.getEightPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(2));
      temp.add(new Integer(3));
      temp.add(new Integer(4));
      temp.add(new Integer(12));
      temp.add(new Integer(13));
      temp.add(new Integer(22));
      temp.add(new Integer(23));
      temp.add(new Integer(14));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.size(), temp.size());
      for (int j = 0; j < ans.size(); j++)
      {
         assertEquals(true, temp.contains(ans.get(j)));
         s.add(ans.get(j));
      }
      assertEquals(ans.size(), s.size());
   }

   public void testTextMessaging01()
   {
      TextMessaging tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("i", 8));
      tx.addTableEntry( new TableEntry("am", 2));
      tx.addTableEntry( new TableEntry("art", 1));

      assertEquals("i", tx.getWord("4"));
      assertEquals("am", tx.getWord("26"));
      assertEquals("i am art", tx.getTextMessage("4 26 278"));

      tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("i", 8));
      tx.addTableEntry( new TableEntry("that", 7));
      tx.addTableEntry( new TableEntry("is", 6));
      tx.addTableEntry( new TableEntry("an", 4));
      tx.addTableEntry( new TableEntry("am", 2));
      tx.addTableEntry( new TableEntry("artist", 1));

      assertEquals("i", tx.getWord("4"));
      assertEquals("am", tx.getWord("26"));
      assertEquals("an", tx.getWord("260"));
      assertEquals("artist", tx.getWord("278478"));
      assertEquals("i am an artist", tx.getTextMessage("4 26 260 278478"));
   }

   public void testTextMessaging02()
   {
      TextMessaging tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("are", 3));
      tx.addTableEntry( new TableEntry("cre", 13));
      tx.addTableEntry( new TableEntry("ase", 8));
      tx.addTableEntry( new TableEntry("you", 2));
      tx.addTableEntry( new TableEntry("your", 2));

      tx.addTableEntry( new TableEntry("what", 3));
      tx.addTableEntry( new TableEntry("why", 15));
      tx.addTableEntry( new TableEntry("when", 8));
      tx.addTableEntry( new TableEntry("thin", 22));
      tx.addTableEntry( new TableEntry("were", 1));

      assertEquals("are", tx.getWord("273"));
      assertEquals("ase", tx.getWord("2730"));
      assertEquals("cre", tx.getWord("27300"));
      assertEquals("you", tx.getWord("968"));
      assertEquals("why", tx.getWord("949"));
    }

   public void testTextMessaging03()
   {
      TextMessaging tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("are", 3));
      tx.addTableEntry( new TableEntry("cre", 13));
      tx.addTableEntry( new TableEntry("ase", 8));
      tx.addTableEntry( new TableEntry("you", 2));
      tx.addTableEntry( new TableEntry("your", 2));

      tx.addTableEntry( new TableEntry("what", 3));
      tx.addTableEntry( new TableEntry("why", 15));
      tx.addTableEntry( new TableEntry("when", 8));
      tx.addTableEntry( new TableEntry("thin", 22));
      tx.addTableEntry( new TableEntry("were", 1));

      assertEquals("were", tx.getWord("9373"));
      assertEquals("your", tx.getWord("9687"));
      assertEquals("what", tx.getWord("9428"));
      assertEquals("when", tx.getWord("9436"));
      assertEquals("thin", tx.getWord("8446"));
    }

   public void testTextMessaging04()
   {
      TextMessaging tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("are", 3));
      tx.addTableEntry( new TableEntry("cre", 13));
      tx.addTableEntry( new TableEntry("ase", 8));
      tx.addTableEntry( new TableEntry("you", 2));
      tx.addTableEntry( new TableEntry("cab", 12));

      tx.addTableEntry( new TableEntry("your", 32));
      tx.addTableEntry( new TableEntry("zotr", 22));
      tx.addTableEntry( new TableEntry("whqt", 3));
      tx.addTableEntry( new TableEntry("why", 15));
      tx.addTableEntry( new TableEntry("when", 8));
      tx.addTableEntry( new TableEntry("thin", 22));
      tx.addTableEntry( new TableEntry("were", 1));
      tx.addTableEntry( new TableEntry("wotr", 17));
      tx.addTableEntry( new TableEntry("xmvs", 7));
      tx.addTableEntry( new TableEntry("wnvp", 11));

      assertEquals("xmvs", tx.getWord("9687"));
      assertEquals("wnvp", tx.getWord("96870"));
      assertEquals("wotr", tx.getWord("968700"));
      assertEquals("zotr", tx.getWord("9687000"));
      assertEquals("your", tx.getWord("96870000"));

      tx.addTableEntry( new TableEntry("zmuq", 4));
      assertEquals("zmuq", tx.getWord("9687"));
      assertEquals("xmvs", tx.getWord("96870"));
      assertEquals("wnvp", tx.getWord("968700"));
      assertEquals("wotr", tx.getWord("9687000"));
      assertEquals("zotr", tx.getWord("96870000"));
      assertEquals("your", tx.getWord("968700000"));
    }

   public void testTextMessaging05()
   {
      TextMessaging tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("are", 3));
      tx.addTableEntry( new TableEntry("you", 2));
      tx.addTableEntry( new TableEntry("cab", 12));
      tx.addTableEntry( new TableEntry("why", 15));

      tx.addTableEntry( new TableEntry("your", 32));
      tx.addTableEntry( new TableEntry("when", 8));
      tx.addTableEntry( new TableEntry("thin", 22));
      tx.addTableEntry( new TableEntry("were", 1));

      tx.addTableEntry( new TableEntry("the", 31));
      tx.addTableEntry( new TableEntry("quick", 13));
      tx.addTableEntry( new TableEntry("brown", 17));
      tx.addTableEntry( new TableEntry("fox", 23));
      tx.addTableEntry( new TableEntry("is", 23));
      tx.addTableEntry( new TableEntry("also", 32));
      tx.addTableEntry( new TableEntry("incredibily", 23));
      tx.addTableEntry( new TableEntry("fast", 1));

      assertEquals("the quick brown fox is also incredibily fast",
              tx.getTextMessage("843 78425 27696 369 47 2576 46273342459 3278"));
    }

   public void testTextMessaging06()
   {
      TextMessaging tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("are", 3));
      tx.addTableEntry( new TableEntry("you", 2));
      tx.addTableEntry( new TableEntry("cab", 12));
      tx.addTableEntry( new TableEntry("why", 15));

      tx.addTableEntry( new TableEntry("your", 32));
      tx.addTableEntry( new TableEntry("when", 8));
      tx.addTableEntry( new TableEntry("thin", 22));
      tx.addTableEntry( new TableEntry("were", 1));

      tx.addTableEntry( new TableEntry("the", 31));
      tx.addTableEntry( new TableEntry("quick", 13));
      tx.addTableEntry( new TableEntry("brown", 17));
      tx.addTableEntry( new TableEntry("fox", 23));
      tx.addTableEntry( new TableEntry("is", 23));
      tx.addTableEntry( new TableEntry("also", 32));
      tx.addTableEntry( new TableEntry("incredibily", 23));
      tx.addTableEntry( new TableEntry("fast", 1));

      assertEquals("the quick brown fox is also incredibily fast",
              tx.getTextMessage("843 78425 27696 369 47 2576 46273342459 3278"));

      tx.addTableEntry( new TableEntry("usc", 100));
      tx.addTableEntry( new TableEntry("i", 2));
      tx.addTableEntry( new TableEntry("a", 1));
      tx.addTableEntry( new TableEntry("better", 15));
      tx.addTableEntry( new TableEntry("school", 11));
      tx.addTableEntry( new TableEntry("than", 22));
      tx.addTableEntry( new TableEntry("ucla", 22));
      assertEquals("usc is a better school than ucla",
              tx.getTextMessage("872 47 2 238837 724665 8426 8252"));

      tx.addTableEntry( new TableEntry("qwerty", 13));
      tx.addTableEntry( new TableEntry("keyboards", 13));
      tx.addTableEntry( new TableEntry("union", 41));
      tx.addTableEntry( new TableEntry("programs", 8));
      tx.addTableEntry( new TableEntry("before", 19));
      tx.addTableEntry( new TableEntry("hicups", 24));
      tx.addTableEntry( new TableEntry("jumps", 4));
      tx.addTableEntry( new TableEntry("belong", 14));
      tx.addTableEntry( new TableEntry("to", 3));
      tx.addTableEntry( new TableEntry("zoo", 3));
      tx.addTableEntry( new TableEntry("know", 3));
      assertEquals("qwerty keyboards union programs before hicups jumps belong to a zoo i know",
              tx.getTextMessage("793789 539262737 86466 77647267 233673 442877 58677 235664 86 2 966 4 5669"));

      tx.addTableEntry( new TableEntry("ghoti", 75));
      tx.addTableEntry( new TableEntry("another", 53));
      tx.addTableEntry( new TableEntry("way", 37));
      tx.addTableEntry( new TableEntry("spell", 34));
      tx.addTableEntry( new TableEntry("fish", 26));
      assertEquals("ghoti is another way to spell fish",
              tx.getTextMessage("44684 47 2668437 929 86 77355 3474"));
   }

   public void testTextMessaging07()
   {
      TextMessaging tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("are", 3));
      tx.addTableEntry( new TableEntry("you", 2));
      tx.addTableEntry( new TableEntry("cab", 12));
      tx.addTableEntry( new TableEntry("why", 15));

      tx.addTableEntry( new TableEntry("your", 32));
      tx.addTableEntry( new TableEntry("when", 8));
      tx.addTableEntry( new TableEntry("thin", 22));
      tx.addTableEntry( new TableEntry("were", 1));

      tx.addTableEntry( new TableEntry("the", 31));
      tx.addTableEntry( new TableEntry("quick", 13));
      tx.addTableEntry( new TableEntry("brown", 17));
      tx.addTableEntry( new TableEntry("fox", 23));
      tx.addTableEntry( new TableEntry("is", 23));
      tx.addTableEntry( new TableEntry("also", 32));
      tx.addTableEntry( new TableEntry("incredibily", 23));
      tx.addTableEntry( new TableEntry("fast", 1));

      assertEquals("the quick brown fox is also incredibily fast",
              tx.getTextMessage("843 78425 27696 369 47 2576 46273342459 3278"));

      tx.addTableEntry( new TableEntry("usc", 100));
      tx.addTableEntry( new TableEntry("i", 3));
      tx.addTableEntry( new TableEntry("a", 2));
      tx.addTableEntry( new TableEntry("b", 1));
      tx.addTableEntry( new TableEntry("better", 15));
      tx.addTableEntry( new TableEntry("school", 11));
      tx.addTableEntry( new TableEntry("than", 22));
      tx.addTableEntry( new TableEntry("ucla", 22));
      tx.addTableEntry( new TableEntry("this", 12));
      tx.addTableEntry( new TableEntry("really", 27));
      tx.addTableEntry( new TableEntry("cool", 41));
      tx.addTableEntry( new TableEntry("contest", 41));
      assertEquals("this is a really cool contest",
              tx.getTextMessage("8447 47 20 732559 2665 2668378"));

      tx.addTableEntry( new TableEntry("dodgers", 13));
      tx.addTableEntry( new TableEntry("angels", 13));
      tx.addTableEntry( new TableEntry("union", 41));
      tx.addTableEntry( new TableEntry("lakers", 8));
      tx.addTableEntry( new TableEntry("clippers", 19));
      tx.addTableEntry( new TableEntry("trojans", 24));
      tx.addTableEntry( new TableEntry("jumps", 4));
      tx.addTableEntry( new TableEntry("belong", 14));
      tx.addTableEntry( new TableEntry("to", 3));
      tx.addTableEntry( new TableEntry("zoo", 3));
      tx.addTableEntry( new TableEntry("know", 3));
      assertEquals("dodgers angels lakers clippers trojans",
              tx.getTextMessage("3634377 264357 525377 25477377 8765267"));

      tx.addTableEntry( new TableEntry("your", 32));
      tx.addTableEntry( new TableEntry("zotr", 22));
      tx.addTableEntry( new TableEntry("wotr", 17));
      tx.addTableEntry( new TableEntry("xmvs", 7));
      tx.addTableEntry( new TableEntry("wnvp", 11));
      tx.addTableEntry( new TableEntry("zmuq", 4));
      tx.addTableEntry( new TableEntry("iq", 40));

      assertEquals("zmuq", tx.getWord("9687"));
      assertEquals("xmvs", tx.getWord("96870"));
      assertEquals("wnvp", tx.getWord("968700"));
      assertEquals("wotr", tx.getWord("9687000"));
      assertEquals("zotr", tx.getWord("96870000"));
      assertEquals("your", tx.getWord("968700000"));

      assertEquals("your zmuq a wotr b dodgers your zotr is zmuq iq",
            tx.getTextMessage("968700000 9687 20 9687000 2 3634377 968700000 96870000 47 9687 470"));
   }

   public void testTextMessaging08()
   {
      testTextMessaging02();
      testTextMessaging04();
      testTextMessaging06();
   }

   public void testTextMessaging09()
   {
      testTextMessaging03();
      testTextMessaging05();
   }

   public void testTextMessaging10()
   {
      testTextMessaging08();
      testTextMessaging09();
   }

   public void testTrainTracks01()
   {
      int k = 0;
      int [][] tracks= { {3, 1, 3, 2, 3}, {3, 1, 1, 1, 2}, {1, 1, 3, 2, 1} };
      TrainTracks thomas = new TrainTracks( tracks );
      ArrayList<String> sol = thomas.getRoute();
      assertEquals(15, sol.size());
      String[] blocks = {"A1", "A2", "A3", "B3", "C3", "C4", "B4", "A4", "A5", "B5", "B4", "B3", "B2", "B1", "A1"};
      for(String b : blocks)
      {
         assertEquals(b, sol.get(k));
         k++;
      }
   }

   public void testTrainTracks02()
   {
      int k = 0;
      int [][] tracks= { {2, 1, 3, 2, 3}, {3, 1, 1, 1, 2}, {1, 1, 3, 2, 1} };
      TrainTracks thomas = new TrainTracks( tracks );
      ArrayList<String> sol = thomas.getRoute();
      assertEquals(1, sol.size());
      assertEquals("A1", sol.get(0));

      k = 0;
      int [][] tracks1 = { {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}};
      thomas = new TrainTracks( tracks1 );
      sol = thomas.getRoute();
      assertEquals(9, sol.size());
      String [] b1 = {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1", "I1"};
      for(String b : b1)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks2 = { {1}, {1}, {1}, {1}, {2}, {1}, {1}, {1}, {1}};
      thomas = new TrainTracks( tracks2 );
      sol = thomas.getRoute();
      assertEquals(5, sol.size());
      String []b2 = {"A1", "B1", "C1", "D1", "E1"};
      for(String b : b2)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks3 = { {1, 3}, {2, 2}};
      thomas = new TrainTracks( tracks3 );
      sol = thomas.getRoute();
      assertEquals(2, sol.size());
      String [] b11 = {"A1", "B1"};
      for(String b : b11)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks4 = { {1, 3}, {1, 1}, {1, 3} };
      thomas = new TrainTracks( tracks4 );
      sol = thomas.getRoute();
      assertEquals(3, sol.size());
      String []b12 = {"A1", "B1", "C1"};
      for(String b : b12)
      {
         assertEquals(b, sol.get(k));
         k++;
      }
   }

   public void testTrainTracks03()
   {
      int k = 0;
      int [][] tracks= { {3, 3, 2}, {1, 3, 3}, {1, 1, 3} };
      TrainTracks thomas = new TrainTracks( tracks );
      ArrayList<String> sol = thomas.getRoute();
      assertEquals(5, sol.size());
      String [] blocks = {"A1", "A2", "B2", "B3", "C3"};
      for(String b : blocks)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks1= { {3, 3, 2, 1}, {1, 3, 3, 3}, {2, 1, 3, 3} };
      thomas = new TrainTracks( tracks1 );
      sol = thomas.getRoute();
      assertEquals(6, sol.size());
      String [] b1 =  {"A1", "A2", "B2", "B3", "C3", "C4"};
      for(String b : b1)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks2 = { {1, 1, 2}, {3, 1, 3}, {2, 3, 1}};
      thomas = new TrainTracks( tracks2 );
      sol = thomas.getRoute();
      assertEquals(5, sol.size());
      String []b2 = {"A1", "B1", "B2", "B3", "C3"};
      for(String b : b2)
      {
         assertEquals(b, sol.get(k));
         k++;
      }
   }

   public void testTrainTracks04()
   {
      int k = 0;
      int [][] tracks= { {3, 3, 2}, {2, 2, 1}, {2, 1, 3} };
      TrainTracks thomas = new TrainTracks( tracks );
      ArrayList<String> sol = thomas.getRoute();
      assertEquals(5, sol.size());
      String [] blocks = {"A1", "A2", "B2", "B1", "C1"};
      for(String b : blocks)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks1= { {3, 1, 3, 2}, {1, 3, 1, 2}, {3, 2, 2, 1}, {3, 3, 1, 2} };
      thomas = new TrainTracks( tracks1 );
      sol = thomas.getRoute();
      assertEquals(11, sol.size());
      String [] b1 =  {"A1", "A2", "A3", "B3", "C3", "C2", "D2","D3", "D4", "C4", "B4"};
      for(String b : b1)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks2 = { {3, 1, 3, 2, 1}, {1, 3, 1, 2, 2}, {3, 2, 2, 1, 1}, {3, 3, 1, 2, 3} };
      thomas = new TrainTracks( tracks2 );
      sol = thomas.getRoute();
      assertEquals(13, sol.size());
      String [] b2 =  {"A1", "A2", "A3", "B3", "C3", "C2", "D2","D3", "D4", "C4", "B4", "B5", "A5"};
      for(String b : b2)
      {
         assertEquals(b, sol.get(k));
         k++;
      }
   }

   public void testTrainTracks05()
   {
      int k = 0;
      int [][] tracks = { {3, 1, 3}, {1, 2, 1}, {1, 3, 1}, {3, 3, 2} };
      TrainTracks thomas = new TrainTracks( tracks );
      ArrayList<String> sol = thomas.getRoute();
      assertEquals(9, sol.size());
      String [] blocks = {"A1", "A2", "A3", "B3", "C3", "D3", "D2", "C2", "C1"};
      for(String b : blocks)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks1 = { {3, 1, 1, 3}, {3, 1, 2, 1}, {2, 1, 3, 1}, {1, 3, 3, 2} };
      thomas = new TrainTracks( tracks1 );
      sol = thomas.getRoute();
      assertEquals(12, sol.size());
      String [] b1 = {"A1", "A2", "A3", "A4", "B4", "C4", "D4", "D3", "C3", "C2", "C1", "D1"};
      for(String b : b1)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks2 = { {3, 1, 1, 1, 1, 1, 1, 3} };
      thomas = new TrainTracks( tracks2 );
      sol = thomas.getRoute();
      assertEquals(8, sol.size());
      String [] b2 =  {"A1", "A2", "A3", "A4", "A5", "A6", "A7","A8"};
      for(String b : b2)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks3 = { {3, 1, 1, 1, 1, 1, 1, 2} };
      thomas = new TrainTracks( tracks3 );
      sol = thomas.getRoute();
      assertEquals(8, sol.size());
      String [] b3 =  {"A1", "A2", "A3", "A4", "A5", "A6", "A7","A8"};
      for(String b : b3)
      {
         assertEquals(b, sol.get(k));
         k++;
      }
   }

   public void testTrainTracks06()
   {
      int k = 0;
      int [][] tracks = { {1, 3, 2, 3, 1, 2}, {3, 1, 1, 2, 2, 3}, {2, 1, 3, 1, 1, 2}, {2, 3, 1, 1, 1, 1}, {1, 3, 1, 1, 1,3}
                          , {3, 1, 2, 2, 3, 2}};
      TrainTracks thomas = new TrainTracks( tracks );
      ArrayList<String> sol = thomas.getRoute();
      assertEquals(36, sol.size());
      String [] blocks = {"A1", "B1", "B2", "B3", "B4", "A4", "A3", "B3", "C3", "C4", "C5", "C6", "B6", "B5", "C5", "D5", "E5", 
                          "F5", "F6", "E6", "E5", "E4", "E3", "E2", "D2", "D1", "E1", "F1", "F2", "F3", "E3", "D3", "C3", "C2",
                          "C1", "D1"};
      for(String b : blocks)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

      k = 0;
      int [][] tracks1 = { {1, 3, 2, 1, 3, 2, 2, 2, 2, 2, 2, 3}, {3, 1, 3, 1, 3, 1, 1, 1, 1, 1, 2, 2},
                           {1, 3, 3, 1, 2, 2, 1, 2, 3, 1, 3, 3}, {1, 1, 1, 3, 2, 2, 2, 1, 3, 3, 1, 1},
                           {3, 3, 3, 1, 2, 2, 1, 2, 3, 1, 3, 1}, {1, 1, 1, 3, 2, 2, 2, 3, 1, 1, 2, 1},
                           {3, 2, 1, 1, 2, 2, 1, 3, 2, 3, 2, 2} };
      thomas = new TrainTracks( tracks1 );
      sol = thomas.getRoute();
      assertEquals(31, sol.size());
      String [] b1 = {"A1", "B1", "B2", "B3", "C3", "C4", "C5", "B5", "B4", "B3", "A3", "A4", "A5", "B5", "B6", "B7", "B8", 
                      "B9", "B10", "B11", "A11", "A12", "B12", "B11", "C11", "C12", "D12", "E12", "F12", "G12", "G11"};
      for(String b : b1)
      {
         assertEquals(b, sol.get(k));
         k++;
      }

   }

   public void testTrainTracks07()
   {
       testTrainTracks01();
       testTrainTracks02();
   }

   public void testTrainTracks08()
   {
       testTrainTracks03();
       testTrainTracks04();
   }

   public void testTrainTracks09()
   {
       testTrainTracks05();
       testTrainTracks06();
   }

   public void testTrainTracks10()
   {
       testTrainTracks08();
       testTrainTracks09();
   }
}