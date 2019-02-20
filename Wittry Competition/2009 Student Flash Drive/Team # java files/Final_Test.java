import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Final_Test extends junit.framework.TestCase
{
   public void testBiodiversity01()
   {
      assertEquals(1, Biodiversity.getDiversity("AAAA"));
      assertEquals(3, Biodiversity.getDiversity("DDDDDDDDDDDDDDDDDDDDDDDDAAADDDDDAADDDDDAAADAAAA"));
      assertEquals(3, Biodiversity.getDiversity("AAADDDDDAADDDDDAAADAAAA"));
      assertEquals(1, Biodiversity.getDiversity("AAADDDDDAAADDDDDAAADAAADDDD"));
      assertEquals(2, Biodiversity.getDiversity("DDDDDDDAAAADDDDDAADDDDDAADAAAADDDDDD"));
   }

   public void testBiodiversity02()
   {
      assertEquals(1, Biodiversity.getDiversity("DDDDAAAA"));
      assertEquals(1, Biodiversity.getDiversity("DDDDDDDDDDDDDDDDDDDDDDDDAAADDDDDDDDDD"));
      assertEquals(6, Biodiversity.getDiversity("ADDDDDAADDDDDAAADAAAADDDAAAAADDAAAAAA"));
      assertEquals(1, Biodiversity.getDiversity("AAAAAADDDDDAAAAAADDDDDAAAAAADDDDDAAAAAADDDDDAAAAAADDDDDAAAAAADDDDD"));
      assertEquals(0, Biodiversity.getDiversity("D"));
   }

   public void testBiodiversity03()
   {
      assertEquals(1, Biodiversity.getDiversity("DDDDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
      assertEquals(1, Biodiversity.getDiversity("DDDDDDDDDDDDDDDDDDDDDDDDADDDDDDDDDD"));
      assertEquals(7, Biodiversity.getDiversity("ADDDDDAADDDDDAAADAAAADDDAAAAADDAAAAAADDDAAAAAAADDDD"));
      assertEquals(2, Biodiversity.getDiversity("AAAAAAAAAAAADDDDDAAAAAAAAAAAAADDDDDAAAAAAAAAAAADDDDD"));
      assertEquals(0, Biodiversity.getDiversity("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"));
   }

   public void testBiodiversity04()
   {
      assertEquals(1, Biodiversity.getDiversity("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADDDD"));
      assertEquals(1, Biodiversity.getDiversity("DAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD"));
      assertEquals(8, Biodiversity.getDiversity("ADDDDDAADDDDDAAADAAAADDDAAAAADDAAAAAADDDAAAAAAADDDDAAAAAAAA"));
      assertEquals(2, Biodiversity.getDiversity("AAAAAAAAAAAAAAAAAAAAAAAAADDDDDAAAAAAAAAAAADDDDD"));
      assertEquals(0, Biodiversity.getDiversity(""));
   }

   public void testBiodiversity05()
   {
      assertEquals(1, Biodiversity.getDiversity("ADDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"));
      assertEquals(2, Biodiversity.getDiversity("DAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADAD"));
      assertEquals(9, Biodiversity.getDiversity("ADDDDDAADDDDDAAADAAAADDDAAAAADDAAAAAADDDAAAAAAADDDDAAAAAAAADAAAAAAAAA"));
      assertEquals(3, Biodiversity.getDiversity("AAAAAAAAAAAAAAAAAAAAAAAAADDDDDAAAAAAAAAAAADDDDDA"));
   }

   public void testBiodiversity06()
   {
      assertEquals(1, Biodiversity.getDiversity("ADDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"));
      assertEquals(1, Biodiversity.getDiversity("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDAAAAAAAAAAAAAAAAA"));
      assertEquals(2, Biodiversity.getDiversity("ADAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADAD"));
      assertEquals(10, Biodiversity.getDiversity("AAAAAAAAAADADDDDDAADDDDDAAADAAAADDDAAAAADDAAAAAADDDAAAAAAADDDDAAAAAAAADAAAAAAAAA"));
      assertEquals(4, Biodiversity.getDiversity("AADDDDDDDDDDDDDDDDDDDDDDDDDDDDDDAAAAAAAAAAAAAAAAAAAAAAAAADDDDDAAAAAAAAAAAADDDDDA"));
   }

   public void testBiodiversity07()
   {
      assertEquals(1, Biodiversity.getDiversity("ADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADADDDDDDDDDDDDDDDDDDDDA"));
      assertEquals(1, Biodiversity.getDiversity("DDDDDDDAAAAAAAAAAAAAAAAADDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDAAAAAAAAAAAAAAAAA"));
      assertEquals(2, Biodiversity.getDiversity("ADAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADADDDDDDDDDDDDDDDDDDDDDD"));
      assertEquals(11, Biodiversity.getDiversity("AAAAAAAAAAADAAAAAAAAAADADDDDDAADDDDDAAADAAAADDDAAAAADDAAAAAADDDAAAAAAADDDDAAAAAAAADAAAAAAAAA"));
      assertEquals(4, Biodiversity.getDiversity("AADDDDDDDDDDDDDDDDDDDDDDDDDDDDDDAAAAAAAAAAAAAAAAAAAAAAAAADDDDDAAAAAAAAAAAADDDDDADAADDDADDADDAADDA"));
   }

   public void testBiodiversity08()
   {
      assertEquals(2, Biodiversity.getDiversity("ADAADADAADADAADADAADADADADAADADAADADADADAADADADAADADADAADADADAADADADADADADADADAADADADADAADADADAADDDDDDDDDDDDDA"));
      assertEquals(2, Biodiversity.getDiversity("AAAAAAAAAAAAAAAAADDDDDDDDDDDDDDDDDDDDDDDDADDDDDDDDDDDDDDDDDDDDDDDDDDDDDDAAAAAAAAAAAAAAAAA"));
      assertEquals(2, Biodiversity.getDiversity("ADAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADADDDDDDDDDDDDDDDDDDDDDDA"));
      assertEquals(12, Biodiversity.getDiversity("AAAAAAAAAAAADAAAAAAAAAAADAAAAAAAAAADADDDDDAADDDDDAAADAAAADDDAAAAADDAAAAAADDDAAAAAAADDDDAAAAAAAADAAAAAAAAA"));
      assertEquals(4, Biodiversity.getDiversity("AADDDDDDDDDDDDAADDDDDDDDDDDDDDDDDDAAAAAAAAAAAAAAAAAAAAAAAAADDDDDAAAAAAAAAAAADDDDDADAADDDADDADDAADDAA"));
   }

   public void testBiodiversity09()
   {
      testBiodiversity01();
      testBiodiversity02();
      testBiodiversity03();
      testBiodiversity04();
   }

   public void testBiodiversity10()
   {
      testBiodiversity05();
      testBiodiversity06();
      testBiodiversity07();
      testBiodiversity08();
      testBiodiversity09();
   }

   public void testFunctionsGoneWild01()
   {
      assertEquals(91, FunctionsGoneWild.function_one(10));
      assertEquals(true, Math.abs(Math.abs(-26.0 - FunctionsGoneWild.function_two(-5))) < 0.05);
      assertEquals(true, Math.abs(2.0439481 - FunctionsGoneWild.function_three(1, 1, 1))<0.5);
      assertEquals(true, Math.abs(0.0 - FunctionsGoneWild.function_four(2, 1)) < 0.5);
      assertEquals(true, Math.abs(1941.227076 - FunctionsGoneWild.function_five(54321, 123.7)) < 0.5);
      assertEquals(true, Math.abs(10.75125008 - FunctionsGoneWild.function_six(2.3, 1, 3.0)) < 0.5);
   }

   public void testFunctionsGoneWild02()
   {
      for (int x = -10000; x < 0; x += 1000)
         assertEquals(91, FunctionsGoneWild.function_one(x));
      for (int x = 0; x < 100; x += 50)
         assertEquals(91, FunctionsGoneWild.function_one(x));
      for (int x = 101; x < 100000; x += 100)
         assertEquals(x-10, FunctionsGoneWild.function_one(x));
   }

   public void testFunctionsGoneWild03()
   {
      int index = 0;
      double[] ans = {0, -0.0075301, .4, 4.2459677, -110, -25.375, -27.3913, -34.22155, -44, -56.52184, -71.88235 };
      for(double x = 0; x < 5.1; x += 0.5)
      {
         assertEquals(true, Math.abs(ans[index] - FunctionsGoneWild.function_two(x)) < 0.05);
         index++;
      }
      assertEquals(true, Math.abs(Math.abs(-430.3478 - FunctionsGoneWild.function_two(10))) < 0.05);
      assertEquals(true, Math.abs(Math.abs(-990.5536004 - FunctionsGoneWild.function_two(13.5))) < 0.05);
      assertEquals(true, Math.abs(Math.abs(-26.0 - FunctionsGoneWild.function_two(-5))) < 0.05);
      assertEquals(true, Math.abs(Math.abs(-5773.111111111 - FunctionsGoneWild.function_two(25))) < 0.05);
   }

   public void testFunctionsGoneWild04()
   {
      assertEquals(true, Math.abs(2.0439481 - FunctionsGoneWild.function_three(1, 1, 1))<0.5);
      assertEquals(true, Math.abs(4.1433397 - FunctionsGoneWild.function_three(2, 2, 2))<0.5);
      assertEquals(true, Math.abs(-11.18152 - FunctionsGoneWild.function_three(10, -5, -1))<0.5);
      assertEquals(true, Math.abs(1.22989 - FunctionsGoneWild.function_three(1, 2, 3))<0.5);
      assertEquals(true, Math.abs(1.0909090 - FunctionsGoneWild.function_three(0, 0, 1))<0.5);
   }

   public void testFunctionsGoneWild05()
   {
      assertEquals(true, Math.abs(0.0 - FunctionsGoneWild.function_four(2, 1)) < 0.5);
      assertEquals(true, Math.abs(1.43067655 - FunctionsGoneWild.function_four(5, 10)) < 0.5);
      assertEquals(true, Math.abs(1 - FunctionsGoneWild.function_four(21, 21)) < 0.5);
      assertEquals(true, Math.abs(0.5 - FunctionsGoneWild.function_four(100, 10)) < 0.5);
      assertEquals(true, Math.abs(0.4418973 - FunctionsGoneWild.function_four(54321, 1123.7)) < 0.5);
   }

   public void testFunctionsGoneWild06()
   {
      assertEquals(true, Math.abs(1941.227076 - FunctionsGoneWild.function_five(54321, 123.7)) < 0.5);
      assertEquals(true, Math.abs(474.66973 - FunctionsGoneWild.function_five(1010, 222)) < 0.5);
      assertEquals(true, Math.abs(523.834679 - FunctionsGoneWild.function_five(222, 1010)) < 0.5);
      assertEquals(true, Math.abs(1.025937 - FunctionsGoneWild.function_five(999, 0.5)) < 0.5);
      assertEquals(true, Math.abs(17104.475940 - FunctionsGoneWild.function_five(12345, 976)) < 0.5);
   }

   public void testFunctionsGoneWild07()
   {
      assertEquals(true, Math.abs(2.95427721 - FunctionsGoneWild.function_six(2, 1, 0)) < 0.5);
      assertEquals(true, Math.abs(411786.8684 - FunctionsGoneWild.function_six(3, -5, 7)) < 0.5);
      assertEquals(true, Math.abs(10.75125008 - FunctionsGoneWild.function_six(2.3, 1, 3.0)) < 0.5);
      assertEquals(true, Math.abs(243.392288955 - FunctionsGoneWild.function_six(5, 1, 2)) < 0.5);
      assertEquals(true, Math.abs(4.43117974439 - FunctionsGoneWild.function_six(1, 2, 1)) < 0.5);
   }

   public void testFunctionsGoneWild08()
   {
      assertEquals(true, Math.abs(1.313137 - FunctionsGoneWild.function_seven(0, 1, 2)) < 0.5);
      assertEquals(true, Math.abs(-27.391304347 - FunctionsGoneWild.function_seven(2, 1, 0)) < 0.5);
      assertEquals(true, Math.abs(-44.0 - FunctionsGoneWild.function_seven(5, -1, 0)) < 0.5);
      assertEquals(true, Math.abs(-50.243136 - FunctionsGoneWild.function_seven(.75, 4./3., 0)) < 0.5);
      assertEquals(true, Math.abs(-27.36111561 - FunctionsGoneWild.function_seven(.75, 11./7., 4./3.)) < 0.5);
      assertEquals(true, Math.abs(-418.66916751 - FunctionsGoneWild.function_seven(4.5, 5.4, .6666)) < 0.5);
   }

   public void testFunctionsGoneWild09()
   {
      assertEquals(true, Math.abs(5.70668302 - FunctionsGoneWild.function_eight(2, 2)) < 0.5);
      assertEquals(true, Math.abs(0 - FunctionsGoneWild.function_eight(5, 1)) < 0.5);
      assertEquals(true, Math.abs(2.1742107938 - FunctionsGoneWild.function_eight(11, 7)) < 0.5);
      assertEquals(true, Math.abs(2.000287332 - FunctionsGoneWild.function_eight(23, 17)) < 0.5);
      assertEquals(true, Math.abs(1.99732134211 - FunctionsGoneWild.function_eight(1111, 21)) < 0.5);
   }

   public void testFunctionsGoneWild10()
   {
      assertEquals(true, Math.abs(5.15292609 - FunctionsGoneWild.function_nine(2., 3., 1., 7., 0.)) < 0.5);
      assertEquals(true, Math.abs(-33.426652267283465 - FunctionsGoneWild.function_nine(4., 5, 3.6146348049962693, 1.76329372287, 0)) < 0.5);
      assertEquals(true, Math.abs(-39.554786056810826 - FunctionsGoneWild.function_nine(4, 8, 3.9054159204957575, 4.019966130510298, 0)) < 0.5);
      assertEquals(true, Math.abs(-22.055076338048256 - FunctionsGoneWild.function_nine(4.0, 2.0, 2.980939000703997, 1.3180594593727637, 0.0)) < 0.5);
      assertEquals(true, Math.abs(-42.63778349389559 - FunctionsGoneWild.function_nine(2.0, 2.0, 4.187513469369325, 3.9195002894029365, 0.0)) < 0.5);
   }
   public void testFunctionsGoneWild11()
   {
      for (int x = -100000; x < 0; x += 1000)
         assertEquals(91, FunctionsGoneWild.function_one(x));
      for (int x = 0; x < 100; x += 50)
         assertEquals(91, FunctionsGoneWild.function_one(x));
      for (int x = 101; x < 100000; x += 100)
         assertEquals(x-10, FunctionsGoneWild.function_one(x));
      int index = 0;

      double[] ans = {0, -0.0075301, .4, 4.2459677, -110, -25.375, -27.3913, -34.22155, -44, -56.52184, -71.88235 };
      for(double x = 0; x < 5.1; x += 0.5)
      {
         assertEquals(true, Math.abs(ans[index] - FunctionsGoneWild.function_two(x)) < 0.05);
         index++;
      }
      assertEquals(true, Math.abs(Math.abs(-430.3478 - FunctionsGoneWild.function_two(10))) < 0.05);
      assertEquals(true, Math.abs(Math.abs(-990.5536004 - FunctionsGoneWild.function_two(13.5))) < 0.05);
      assertEquals(true, Math.abs(Math.abs(-26.0 - FunctionsGoneWild.function_two(-5))) < 0.05);
      assertEquals(true, Math.abs(Math.abs(-5773.111111111 - FunctionsGoneWild.function_two(25))) < 0.05);

      assertEquals(true, Math.abs(2.0439481 - FunctionsGoneWild.function_three(1, 1, 1))<0.5);
      assertEquals(true, Math.abs(-11.18152 - FunctionsGoneWild.function_three(10, -5, -1))<0.5);
      assertEquals(true, Math.abs(1.0909090 - FunctionsGoneWild.function_three(0, 0, 1))<0.5);

      assertEquals(true, Math.abs(0.0 - FunctionsGoneWild.function_four(2, 1)) < 0.5);
      assertEquals(true, Math.abs(1 - FunctionsGoneWild.function_four(21, 21)) < 0.5);
      assertEquals(true, Math.abs(0.5 - FunctionsGoneWild.function_four(100, 10)) < 0.5);

      assertEquals(true, Math.abs(474.66973 - FunctionsGoneWild.function_five(1010, 222)) < 0.5);
      assertEquals(true, Math.abs(523.834679 - FunctionsGoneWild.function_five(222, 1010)) < 0.5);
      assertEquals(true, Math.abs(1.025937 - FunctionsGoneWild.function_five(999, 0.5)) < 0.5);

      assertEquals(true, Math.abs(2.95427721 - FunctionsGoneWild.function_six(2, 1, 0)) < 0.5);
      assertEquals(true, Math.abs(411786.8684 - FunctionsGoneWild.function_six(3, -5, 7)) < 0.5);

      assertEquals(true, Math.abs(-27.391304347 - FunctionsGoneWild.function_seven(2, 1, 0)) < 0.5);
      assertEquals(true, Math.abs(-27.55688738 - FunctionsGoneWild.function_seven(.75, 11./7., 4./3.)) < 0.5);
      assertEquals(true, Math.abs(-418.66916751 - FunctionsGoneWild.function_seven(4.5, 5.4, .6666)) < 0.5);

      assertEquals(true, Math.abs(0 - FunctionsGoneWild.function_eight(5, 1)) < 0.5);
      assertEquals(true, Math.abs(2.1742107938 - FunctionsGoneWild.function_eight(11, 7)) < 0.5);
      assertEquals(true, Math.abs(2.000287332 - FunctionsGoneWild.function_eight(23, 17)) < 0.5);

      assertEquals(true, Math.abs(-39.554786056810826 - FunctionsGoneWild.function_nine(4, 8, 3.9054159204957575, 4.019966130510298, 0)) < 0.5);
      assertEquals(true, Math.abs(-42.63778349389559 - FunctionsGoneWild.function_nine(2.0, 2.0, 4.187513469369325, 3.9195002894029365, 0.0)) < 0.5);
    }

   public void testHappyNumber00()
   {
      HappyNumber h = new HappyNumber();

      assertEquals(true, h.isHappyNumber(7));
      assertEquals(true, h.isHappyNumber(496));
      assertEquals(false, h.isHappyNumber(17));
      assertEquals(false, h.isHappyNumber(477));
   }

   public void testHappyNumber01()
   {
      HappyNumber h = new HappyNumber();

      assertEquals(true, h.isHappyNumber(1));
      assertEquals(true, h.isHappyNumber(13));
      assertEquals(true, h.isHappyNumber(188));
      assertEquals(true, h.isHappyNumber(326));
      assertEquals(true, h.isHappyNumber(446));

      assertEquals(false, h.isHappyNumber(45));
      assertEquals(false, h.isHappyNumber(200));
      assertEquals(false, h.isHappyNumber(317));
      assertEquals(false, h.isHappyNumber(499));
      assertEquals(false, h.isHappyNumber(2));
   }

   public void testHappyNumber02()
   {
      HappyNumber h = new HappyNumber();

      assertEquals(true, h.isHappyNumber(10));
      assertEquals(true, h.isHappyNumber(193));
      assertEquals(true, h.isHappyNumber(367));
      assertEquals(true, h.isHappyNumber(368));
      assertEquals(true, h.isHappyNumber(293));

      assertEquals(false, h.isHappyNumber(99));
      assertEquals(false, h.isHappyNumber(300));
      assertEquals(false, h.isHappyNumber(400));
      assertEquals(false, h.isHappyNumber(0));
      assertEquals(false, h.isHappyNumber(55));
   }

   public void testHappyNumber03()
   {
      HappyNumber h = new HappyNumber();

      assertEquals(true, h.isHappyNumber(32));
      assertEquals(true, h.isHappyNumber(190));
      assertEquals(true, h.isHappyNumber(236));
      assertEquals(true, h.isHappyNumber(383));
      assertEquals(true, h.isHappyNumber(490));

      assertEquals(false, h.isHappyNumber(98));
      assertEquals(false, h.isHappyNumber(11));
      assertEquals(false, h.isHappyNumber(69));
      assertEquals(false, h.isHappyNumber(499));
      assertEquals(false, h.isHappyNumber(155));
   }

   public void testHappyNumber04()
   {
      HappyNumber h = new HappyNumber();
      
      assertEquals(true, h.isHappyNumber(82));
      assertEquals(true, h.isHappyNumber(129));
      assertEquals(true, h.isHappyNumber(338));
      assertEquals(true, h.isHappyNumber(230));
      assertEquals(true, h.isHappyNumber(478));

      assertEquals(false, h.isHappyNumber(85));
      assertEquals(false, h.isHappyNumber(95));
      assertEquals(false, h.isHappyNumber(295));
      assertEquals(false, h.isHappyNumber(395));
      assertEquals(false, h.isHappyNumber(5));
   }

   public void testHappyNumber05()
   {
      HappyNumber h = new HappyNumber();

      assertEquals(true, h.isHappyNumber(440));
      assertEquals(true, h.isHappyNumber(301));
      assertEquals(true, h.isHappyNumber(302));
      assertEquals(true, h.isHappyNumber(91));
      assertEquals(true, h.isHappyNumber(133));

      assertEquals(false, h.isHappyNumber(441));
      assertEquals(false, h.isHappyNumber(303));
      assertEquals(false, h.isHappyNumber(30));
      assertEquals(false, h.isHappyNumber(134));
      assertEquals(false, h.isHappyNumber(6));
   }

   public void testHappyNumber06()
   {
      HappyNumber h = new HappyNumber();
      
      assertEquals(true, h.isHappyNumber(19));
      assertEquals(true, h.isHappyNumber(23));
      assertEquals(true, h.isHappyNumber(356));
      assertEquals(true, h.isHappyNumber(487));
      assertEquals(true, h.isHappyNumber(263));

      assertEquals(false, h.isHappyNumber(407));
      assertEquals(false, h.isHappyNumber(247));
      assertEquals(false, h.isHappyNumber(309));
      assertEquals(false, h.isHappyNumber(14));
      assertEquals(false, h.isHappyNumber(3));
   }

   public void testHappyNumber07()
   {
      HappyNumber h = new HappyNumber();
      assertEquals(true, h.isHappyNumber(28));
      assertEquals(true, h.isHappyNumber(176));
      assertEquals(true, h.isHappyNumber(192));
      assertEquals(true, h.isHappyNumber(331));
      assertEquals(true, h.isHappyNumber(362));

      assertEquals(false, h.isHappyNumber(8));
      assertEquals(false, h.isHappyNumber(396));
      assertEquals(false, h.isHappyNumber(1111));
      assertEquals(false, h.isHappyNumber(1405));
      assertEquals(false, h.isHappyNumber(38912));

      assertEquals(true, h.isHappyNumber(20800));
      assertEquals(true, h.isHappyNumber(107060));
      assertEquals(true, h.isHappyNumber(109020));
      assertEquals(true, h.isHappyNumber(1030300));
      assertEquals(true, h.isHappyNumber(30602000));
    }

   public void testHappyNumber08()
   {
      HappyNumber h = new HappyNumber();
      assertEquals(true, h.isHappyNumber(31));
      assertEquals(true, h.isHappyNumber(44));
      assertEquals(true, h.isHappyNumber(49));
      assertEquals(true, h.isHappyNumber(68));
      assertEquals(true, h.isHappyNumber(70));
      assertEquals(true, h.isHappyNumber(203));
      assertEquals(true, h.isHappyNumber(208));
      assertEquals(true, h.isHappyNumber(219));
      assertEquals(true, h.isHappyNumber(365));
      assertEquals(true, h.isHappyNumber(379));
      
      assertEquals(true, h.isHappyNumber(469));
      assertEquals(true, h.isHappyNumber(464));
      assertEquals(true, h.isHappyNumber(409));
      assertEquals(true, h.isHappyNumber(404));
      assertEquals(true, h.isHappyNumber(397));

      assertEquals(true, h.isHappyNumber(10821));
      assertEquals(true, h.isHappyNumber(10900));
      assertEquals(true, h.isHappyNumber(91000));
      assertEquals(true, h.isHappyNumber(310090));
      assertEquals(true, h.isHappyNumber(1090607));
      assertEquals(true, h.isHappyNumber(3906823));

      testHappyNumber07();
      testHappyNumber06();
      testHappyNumber05();
      testHappyNumber04();
      testHappyNumber03();
      testHappyNumber02();
   }
   public void testHappyNumber09()
   {
      HappyNumber h = new HappyNumber();

      assertEquals(true, h.isHappyNumber(79));
      assertEquals(true, h.isHappyNumber(86));
      assertEquals(true, h.isHappyNumber(94));
      assertEquals(true, h.isHappyNumber(97));
      assertEquals(true, h.isHappyNumber(100));
      assertEquals(true, h.isHappyNumber(103));
      assertEquals(true, h.isHappyNumber(109));
      assertEquals(true, h.isHappyNumber(130));
      assertEquals(true, h.isHappyNumber(139));
      assertEquals(true, h.isHappyNumber(167));
      
      assertEquals(true, h.isHappyNumber(376));
      assertEquals(true, h.isHappyNumber(386));
      assertEquals(true, h.isHappyNumber(391));
      assertEquals(true, h.isHappyNumber(392));
      assertEquals(true, h.isHappyNumber(329));

//  226, 239, 262, 263, 280, 291, 310, 313, 319, 320
      assertEquals(true, h.isHappyNumber(226));
      assertEquals(true, h.isHappyNumber(239));
      assertEquals(true, h.isHappyNumber(262));
      assertEquals(true, h.isHappyNumber(263));
      assertEquals(true, h.isHappyNumber(280));
      assertEquals(true, h.isHappyNumber(291));
      assertEquals(true, h.isHappyNumber(310));
      assertEquals(true, h.isHappyNumber(313));
      assertEquals(true, h.isHappyNumber(319));
      assertEquals(true, h.isHappyNumber(320));
      assertEquals(true, h.isHappyNumber(396823));

      assertEquals(false, h.isHappyNumber(86548));
      assertEquals(false, h.isHappyNumber(1123411));
      assertEquals(false, h.isHappyNumber(143405));
      assertEquals(false, h.isHappyNumber(3893412));

      testHappyNumber08();
   }

   public void testJarredsHomework00()
   {
      double [] boardValues = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99, 69.99, 14.75, 350.0, 0 };
      JarredsHomework game = new JarredsHomework(boardValues);

      int [] rolls = { 3, 1, 5, 3, 2, 6};
      double ans = 3*boardValues[2] + boardValues[2+1] + 5*boardValues[2+1+5] + 3*boardValues[2+1+5+3] + 2*boardValues[2+1+5+3+2];
      assertEquals(ans, game.playGame( rolls ));

      boolean flag = Math.abs(2649.38 - game.findMax()) < 0.0005;
      assertEquals(true, flag);

      flag = Math.abs(34.9 - game.findMin()) < 0.0005;
      assertEquals(true, flag);
   }

   public void testJarredsHomework01()   // all play game
   {
      double [] boardValues = {12.75, 13.89, 6.91, 7.99, 11.09, 3.25, 19.39, 9.79, 17.52, 31.19, 4.44, 6.69, 14.41, 30.0, 0.01, 33.3 };
      JarredsHomework game = new JarredsHomework(boardValues);

      int [] rolls = { 3, 2, 4, 5, 1, 6};
      double ans = 3*boardValues[2] + 2*boardValues[2+2] + 4*boardValues[2+2+4] + 5*boardValues[2+2+4+5] + boardValues[2+2+4+5+1]+ boardValues[boardValues.length-1];
      assertEquals(ans, game.playGame( rolls ));

      int [] rolls2 = { 1, 4, 5, 3, 6};
      ans = boardValues[0] + 4*boardValues[0+4] + 5*boardValues[0+4+5] + 3*boardValues[0+4+5+3] + 3*boardValues[boardValues.length-1];
      assertEquals(ans, game.playGame( rolls2 ));

      double [] boardValues2 = {5.02, 7.15, 9.61, 5.19, 11.13, 13.02, 2.39, 4.69, 1.52, 1.79, 5.43, 6.69, 4.01, 0.50, 0.01, 3.3, 4., 2., 0 };
      game = new JarredsHomework(boardValues2);
      int [] rolls3 = { 2, 1, 4, 5, 3, 6};
      ans = 2*boardValues2[1] + 1*boardValues2[1+1] + 4*boardValues2[1+1+4] + 5*boardValues2[1+1+4+5] 
                  + 3*boardValues2[1+1+4+5+3] + 4*boardValues2[boardValues2.length-1];
      assertEquals(ans, game.playGame( rolls3 ));

      int [] rolls4 = { 2, 1, 4, 5, 3, 4};
      assertEquals(ans, game.playGame( rolls4 ));

      int [] rolls5 = { 2, 1, 4, 5, 3, 5};
      assertEquals(ans, game.playGame( rolls5 ));
   }

   public void testJarredsHomework02()   // find Max
   {
      double [] boardValues = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9};
      JarredsHomework game = new JarredsHomework(boardValues);

      boolean flag = Math.abs(549.38 - game.findMax()) < 0.005;
      assertEquals(true, flag);

      double [] boardValues1 = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99};
      game = new JarredsHomework(boardValues1);

      flag = Math.abs(624.35 - game.findMax()) < 0.005;
      assertEquals(true, flag);

      double [] boardValues2 = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99, 69.99};
      game = new JarredsHomework(boardValues2);

      flag = Math.abs(829.34 - game.findMax()) < 0.005;
      assertEquals(true, flag);

      double [] boardValues3 = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99, 69.99, 14.75};
      game = new JarredsHomework(boardValues3);

      flag = Math.abs(844.09 - game.findMax()) < 0.005;
      assertEquals(true, flag);

      double [] boardValues4 = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99, 69.99, 14.75, 350.0};
      game = new JarredsHomework(boardValues4);

      flag = Math.abs(2649.38 - game.findMax()) < 0.005;
      assertEquals(true, flag);
   }

   public void testJarredsHomework03()   // all findMin
   {
      double [] boardValues = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95};
      JarredsHomework game = new JarredsHomework(boardValues);

      boolean flag = Math.abs(64.15 - game.findMin()) < 0.005;
      assertEquals(true, flag);

      double [] boardValues1 = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19};
      game = new JarredsHomework(boardValues1);

      flag = Math.abs(34.9 - game.findMin()) < 0.005;
      assertEquals(true, flag);

      double [] boardValues2 = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99, 69.99};
      game = new JarredsHomework(boardValues2);

      flag = Math.abs(129.88 - game.findMin()) < 0.005;
      assertEquals(true, flag);

      double [] boardValues3 = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99, 69.99, 14.75};
      game = new JarredsHomework(boardValues3);

      flag = Math.abs(79.15 - game.findMin()) < 0.005;
      assertEquals(true, flag);

      double [] boardValues4 = {5.99, 3.99, 16.99, 27.99, 6.99, 13.25, 21.95, 89.9, 17.5, 1.19, 24.99, 69.99, 14.75, 350.0};
      game = new JarredsHomework(boardValues4);

      flag = Math.abs(429.15 - game.findMin()) < 0.005;
      assertEquals(true, flag);
    }

   public void testJarredsHomework04()   // find Max and findMin
   {
      double [] boardValues = {15.92, 13.19, 6.92, 2.99, 9.09, 3.25, 21.51, 9.09, 2.32, 17.71, 7.63, 12.12, 43.43, 1.02, 0.26, 30.47, 0.00};
      JarredsHomework game = new JarredsHomework(boardValues);

      boolean maxflag = Math.abs(15.92+6*21.51+6*43.43+3*30.47 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);

      boolean minflag = Math.abs(4*2.99+5*2.32+6*0.26 - game.findMin()) < 0.005;
      assertEquals(true, minflag);

      double [] boardValues1 = {4.49, 1.69, 7.82, 0.69, 1.32, 1.95, 9.29, 1.75, 7.19, 4.47, 2.22, 1.11, 3.33, 0.01, 0.02, 0.03};
      game = new JarredsHomework(boardValues1);

      maxflag = Math.abs(3*7.82+4*9.29+2*7.19+4.47+3*3.33+3*.03 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);

      minflag = Math.abs(4*0.69+1.32+3*1.75+6*0.01+0.02+0.03 - game.findMin()) < 0.005;
      assertEquals(true, minflag);

      double [] boardValues2 = {15.99, 23.99, 26.99, 23.90, 19.69, 13.25, 21.09, 8.92, 37.5, 21.19, 24.79, 9.99, 0.00};
      game = new JarredsHomework(boardValues2);

      maxflag = Math.abs(3*26.99+6*37.5+2*24.79+9.99 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);

      minflag = Math.abs(15.99+23.99+6*8.92 - game.findMin()) < 0.005;
      assertEquals(true, minflag);

      double [] boardValues3 = {0.59, 3.99, 1.69, 2.29, 1.69, 1.35, 1.95, 0.89, 1.52, 1.13, 2.09, 6.01, 1.75};
      game = new JarredsHomework(boardValues3);

      maxflag = Math.abs(2*3.99+2*2.29+1.69+1.35+6*6.01+1.75 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);

      minflag = Math.abs(0.59+2*1.69+5*0.89+2*1.13+3*1.75 - game.findMin()) < 0.005;
      assertEquals(true, minflag);
    }

   public void testJarredsHomework05()   // playGame and findMax
   {
      double [] boardValues = {1.92, 1.19, 6.12, 12.99, 9.19, 2.25, 2.51, 5.09, 2.27, 7.1, 7.3, 1.1, 4.03, 0.02, 0.61, 3.07, 0.10};
      JarredsHomework game = new JarredsHomework(boardValues);

      boolean maxflag = Math.abs(4*12.99+9.19+6*7.3+2*4.03+3*3.07+0.1 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);

      int [] rolls = { 1, 2, 3, 4, 1, 6};
      System.out.println((1.92+2*6.12+3*2.25+4*7.1+7.3+6*0.1) + " <- ans  play method -> " + game.playGame(rolls));
      boolean scoreflag = Math.abs(1.92+2*6.12+3*2.25+4*7.1+7.3+6*0.1 - game.playGame(rolls)) < 0.005;
      assertEquals(true, scoreflag);


      double [] boardValues2 = {5.99, 3.99, 2.99, 2.90, 1.99, 3.15, 1.09, 3.92, 3.51, 2.19, 24.79, 9.99, 0.00};
      game = new JarredsHomework(boardValues2);

      int [] rolls3 = { 2, 1, 1, 6, 2, 6};
      scoreflag = Math.abs(2*3.99+2.99+2.9+6*2.19+2*9.99 - game.playGame(rolls3)) < 0.005;
      assertEquals(true, scoreflag);

      maxflag = Math.abs(5.99+3.99+2.99+2.9+1.99+6*24.79+9.99 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);

      double [] boardValues3 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 1.1, 2.1, 3.1, 4.1, 5.1, 1.2, 2.2, 3.2, 4.2, 
                                  1.3, 2.3, 3.3, 1.4, 2.4, 1.5, 0};
      game = new JarredsHomework(boardValues3);

      maxflag = Math.abs(6*6.0+5*5.1+4*4.2+3*3.3+2*2.4+1.5 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);

      int [] rolls4 = {1, 2, 3, 4, 5, 6, 2 };
      scoreflag = Math.abs(1.0+2*3.0+3*6.0+4*4.1+5*4.2+6*1.5 - game.playGame(rolls4)) < 0.005;
      assertEquals(true, scoreflag);

      double [] boardValues1 = {0.49, 2.69, 1.82, 3.69, 7.32, 6.5, 1.29, 5.75, 2.19, 2.72, 1.11, 5.3, 0.02, 0.0};
      game = new JarredsHomework(boardValues1);

      maxflag = Math.abs(5*7.32+6.5+2*5.75+4*5.3+.02 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);


      int [] rolls2 = { 2, 3, 4, 4, 1};
      scoreflag = Math.abs( 2*2.69+3*7.32+4*2.19+4*0.02 - game.playGame(rolls2)) < 0.005;
      assertEquals(true, scoreflag);
    }

   public void testJarredsHomework06()   // playGame and findMin
   {
      double [] boardValues = {92., 19., 12., 2.99, 9.9, 2.5, 2.65, 25.9, 12.27, 37.1, 47.3, 31.1, 24.03, 0.92, 90.61, 99.0, 183.07};
      JarredsHomework game = new JarredsHomework(boardValues);

      System.out.println((6*2.5+2.65+2*12.27+5*0.92+90.61+99+183.07) + " <- ans  method -> " + game.findMin());
      boolean minflag = Math.abs(6*2.5+2.65+2*12.27+5*0.92+90.61+99+183.07 - game.findMin()) < 0.005;
      assertEquals(true, minflag);

      int [] rolls = { 5, 3, 1, 4, 2,1,1};
      boolean scoreflag = Math.abs(5*9.9+3*25.9+12.27+4*24.03+2*90.61+99+183.07 - game.playGame(rolls)) < 0.005;
      assertEquals(true, scoreflag);

      double [] boardValues1 = {2.0, 6.23, 7.89, 5.45, 6.12, 8.12, 9.05, 8.13, 4.56, 0.99, 4.56, 1.98, 0.00};
      game = new JarredsHomework(boardValues1);

      minflag = Math.abs(2.0+3*5.45+6*0.99 - game.findMin()) < 0.005;
      assertEquals(true, minflag);

      int [] rolls2 = { 2, 2, 2, 2, 1, 1, 1, 1, 4};
      scoreflag = Math.abs(2*6.23+2*5.45+2*8.12+2*8.13+4.56+0.99+4.56+1.98 - game.playGame(rolls2)) < 0.005;
      assertEquals(true, scoreflag);

      double [] boardValues2 = {6.0, 5.0, 4.0, 3.0, 2.0, 1.0, 5.1, 4.1, 3.1, 2.1, 1.1, 4.2, 3.2, 2.2, 1.2,
                                       2.3, 1.3, 1.4};
      game = new JarredsHomework(boardValues2);

      int [] rolls3 = {1, 2, 3, 4, 5, 2, 1};
      scoreflag = Math.abs(6.0+2*4.0+3*1.0+4*2.1+5*1.2+2*1.3+1.4 - game.playGame(rolls3)) < 0.005;
      assertEquals(true, scoreflag);

      minflag = Math.abs(6*1.0+5*1.1+4*1.2+2*1.3+1.4 - game.findMin()) < 0.005;
      assertEquals(true, minflag);

    }

    public void testJarredsHomework07()   // all three
    {
      double [] boardValues1 = {0.49, 2.69, 1.82, 3.69, 7.32, 6.5, 1.29, 5.75, 2.19, 2.72, 1.11, 5.3, 0.02, 0.0};
      JarredsHomework game = new JarredsHomework(boardValues1);

      int [] rolls2 = { 2, 3, 4, 4, 1};
      boolean scoreflag = Math.abs( 2*2.69+3*7.32+4*2.19+4*0.02 - game.playGame(rolls2)) < 0.005;
      assertEquals(true, scoreflag);

      testJarredsHomework04();
      testJarredsHomework06();
    }

    public void testJarredsHomework08()   // all three
    {
      double [] boardValues2 = {15.99, 23.99, 26.99, 23.90, 19.69, 13.25, 21.09, 8.92, 37.5, 21.19, 24.79, 9.99, 0.00};
      JarredsHomework game = new JarredsHomework(boardValues2);

      System.out.println((15.99+23.99+6*8.92) + " <- ans  method -> " + game.findMin());
      boolean minflag = Math.abs(15.99+23.99+6*8.92 - game.findMin()) < 0.005;
      assertEquals(true, minflag);

      double [] boardValues3 = {0.59, 3.99, 1.69, 2.29, 1.69, 1.35, 1.95, 0.89, 1.52, 1.13, 2.09, 6.01, 1.75};
      game = new JarredsHomework(boardValues3);

      System.out.println((2*3.99+2*2.29+1.69+1.35+6*6.01+1.75) + " <- ans  method -> " + game.findMax());
      boolean maxflag = Math.abs(2*3.99+2*2.29+1.69+1.35+6*6.01+1.75 - game.findMax()) < 0.005;
      assertEquals(true, maxflag);

      double [] boardValues31 = {0.59, 3.99, 1.69, 2.29, 1.69, 1.35, 1.95, 0.89, 1.52, 1.13, 2.09, 6.01, 1.75};
      game = new JarredsHomework(boardValues31);

      minflag = Math.abs(0.59+2*1.69+5*0.89+2*1.13+3*1.75 - game.findMin()) < 0.005;
      assertEquals(true, minflag);

      testJarredsHomework04();
      testJarredsHomework07();
    }

    public void testJarredsHomework09()   // all three
    {
       testJarredsHomework04();
       testJarredsHomework05();
       testJarredsHomework06();
       testJarredsHomework07();
    }

   public void testLongestPalindrome01()
   {
      LongestPalindrome pal = new LongestPalindrome("racecar");
      assertEquals("racecar", pal.getLongestPalindrome());

      pal = new LongestPalindrome("dsffsdg kjab %Bkj.  abcbabCdcbaqwerewq.");
      assertEquals("abCdcba", pal.getLongestPalindrome());

      pal = new LongestPalindrome("Madam, I'm Adam");
      assertEquals("MadamImAdam", pal.getLongestPalindrome());
   }

   public void testLongestPalindrome02()   // all lower - entire word
   {
      LongestPalindrome pal = new LongestPalindrome("mom");
      assertEquals("mom", pal.getLongestPalindrome());

      pal = new LongestPalindrome("rotavator");
      assertEquals("rotavator", pal.getLongestPalindrome());

      pal = new LongestPalindrome("momrotavatorwow");
      assertEquals("rotavator", pal.getLongestPalindrome());

      pal = new LongestPalindrome("detartrated");
      assertEquals("detartrated", pal.getLongestPalindrome());

      pal = new LongestPalindrome("aibohphobia");
      assertEquals("aibohphobia", pal.getLongestPalindrome());

      pal = new LongestPalindrome("kinnikinnik");
      assertEquals("kinnikinnik", pal.getLongestPalindrome());

      pal = new LongestPalindrome("zcfgjlqsuwxyyxwusqljgfcz");
      assertEquals("zcfgjlqsuwxyyxwusqljgfcz", pal.getLongestPalindrome());
   }

   public void testLongestPalindrome03()   /// lower and upper case - entire word
   {
      LongestPalindrome pal = new LongestPalindrome("Mom");
      assertEquals("Mom", pal.getLongestPalindrome());

      pal = new LongestPalindrome("rOtAvaTor");
      assertEquals("rOtAvaTor", pal.getLongestPalindrome());

      pal = new LongestPalindrome("momrOtAvaTorwow");
      assertEquals("rOtAvaTor", pal.getLongestPalindrome());

      pal = new LongestPalindrome("DETARtrated");
      assertEquals("DETARtrated", pal.getLongestPalindrome());

      pal = new LongestPalindrome("aibohPHOBIA");
      assertEquals("aibohPHOBIA", pal.getLongestPalindrome());

      pal = new LongestPalindrome("KiNNiKInnIk");
      assertEquals("KiNNiKInnIk", pal.getLongestPalindrome());

      pal = new LongestPalindrome("ZcFgJlQsUwXyYxWuSqLjGfCz");
      assertEquals("ZcFgJlQsUwXyYxWuSqLjGfCz", pal.getLongestPalindrome());
   }

   public void testLongestPalindrome04()    //lower and upper and punctuation - entire word or in middle
   {
      LongestPalindrome pal = new LongestPalindrome("deified");
      assertEquals("deified", pal.getLongestPalindrome());

      pal = new LongestPalindrome("momrOtAvaTorwow");
      assertEquals("rOtAvaTor", pal.getLongestPalindrome());

      pal = new LongestPalindrome("rOtAvaTor");
      assertEquals("rOtAvaTor", pal.getLongestPalindrome());

      pal = new LongestPalindrome("A dog, a plan, a canal: pagoda");
      assertEquals("Adogaplanacanalpagoda", pal.getLongestPalindrome());

      pal = new LongestPalindrome("AToyotaRacefastsafecarAToyota");
      assertEquals("AToyotaRacefastsafecarAToyota", pal.getLongestPalindrome());

      pal = new LongestPalindrome("repaper");
      assertEquals("repaper", pal.getLongestPalindrome());

      pal = new LongestPalindrome("jqkbhlumvxwzzwxvmulhbkqj");
      assertEquals("jqkbhlumvxwzzwxvmulhbkqj", pal.getLongestPalindrome());
   }

   public void testLongestPalindrome05()   // all lower case - palindrome at front
   {
      LongestPalindrome pal = new LongestPalindrome("racecarmomwow");
      assertEquals("racecar", pal.getLongestPalindrome());

      pal = new LongestPalindrome("detartratedradarlevel");
      assertEquals("detartrated", pal.getLongestPalindrome());

      pal = new LongestPalindrome("kinnikinnikdetartrateradarlevelreferracecar");
      assertEquals("kinnikinnik", pal.getLongestPalindrome());

      pal = new LongestPalindrome("yzpjvhbfgmqsuxxusqmgfbhvjpzyWYUdetartratedaaa");
      assertEquals("yzpjvhbfgmqsuxxusqmgfbhvjpzy", pal.getLongestPalindrome());
   }

   public void testLongestPalindrome06()   // lower & upper case + puncutation - palindrome at front
   {
      LongestPalindrome pal = new LongestPalindrome("raCecARmoMWow");
      assertEquals("raCecAR", pal.getLongestPalindrome());

      pal = new LongestPalindrome("DeTaRtratEdraDaRLeVEL");
      assertEquals("DeTaRtratEd", pal.getLongestPalindrome());

      pal = new LongestPalindrome("kiNNikInnIKetArtraTEDradaRLEveLrefeRRaceCAR");
      assertEquals("kiNNikInnIK", pal.getLongestPalindrome());

      pal = new LongestPalindrome("Anne, I vote more cars race Rome to Vienna.kinnikinnikA tin mug for a jar of gum, Nita");
      assertEquals("AnneIvotemorecarsraceRometoVienna", pal.getLongestPalindrome());

      pal = new LongestPalindrome("yZPjhbFGmqUx XuQMG fbHJP zY.DeTaRtratEd-raDaRLeVEL");
      assertEquals("yZPjhbFGmqUxXuQMGfbHJPzY", pal.getLongestPalindrome());
   }

   public void testLongestPalindrome07()   // lower case - palindrome at end
   {
      LongestPalindrome pal = new LongestPalindrome("raecarsexespeeweepmalayalam");
      assertEquals("malayalam", pal.getLongestPalindrome());

      pal = new LongestPalindrome("repaperwtestsetevitative");
      assertEquals("evitative", pal.getLongestPalindrome());

      pal = new LongestPalindrome("detartrateradarlevelreferracecarkinnikinnik");
      assertEquals("kinnikinnik", pal.getLongestPalindrome());

      pal = new LongestPalindrome("zpjvhbqsuxxugfbhvjpzydetartratedaaayzpjvhbfgmqsuxxusqmgfbhvjpzy");
      assertEquals("yzpjvhbfgmqsuxxusqmgfbhvjpzy", pal.getLongestPalindrome());
   }

//  REST OF TESTER NEED WORK!!!!!!!!!!

   public void testLongestPalindrome08()   // lower & upper case + puncutation - palindrome at end
   {
      LongestPalindrome pal = new LongestPalindrome("raCecARmoMWowDeTaRtratEd");
      assertEquals("DeTaRtratEd", pal.getLongestPalindrome());

      pal = new LongestPalindrome("DeTaRtratEdraDaRLeVELqkiNNikInnIKq");
      assertEquals("qkiNNikInnIKq", pal.getLongestPalindrome());

      pal = new LongestPalindrome("kiNNikInnIKetArtraTEDA new order began, a more Roman age bred Rowena.");
      assertEquals("AneworderbeganamoreRomanagebredRowena", pal.getLongestPalindrome());

      pal = new LongestPalindrome("Anne, I vote more cars race Rome to Vienna.kinnikinnikA tin mug for a jar of gum, Nita");
      assertEquals("AnneIvotemorecarsraceRometoVienna", pal.getLongestPalindrome());

      pal = new LongestPalindrome("uf!hy:kp;.x.xpk$yh@fu zooz DeTaRtratEd-raDaRLeVEL");
      assertEquals("ufhykpxxpkyhfu", pal.getLongestPalindrome());
   }

   public void testLongestPalindrome09()
   {
      testLongestPalindrome03();
      testLongestPalindrome05();
      testLongestPalindrome07();
   }

   public void testLongestPalindrome10()
   {
      testLongestPalindrome03();
      testLongestPalindrome04();
      testLongestPalindrome05();
      testLongestPalindrome06();
      testLongestPalindrome07();
      testLongestPalindrome08();
   }

   public void testPlanimeter01()
   {
      Command[] com1 = {new Command("r", 2), new Command("u", 2), new Command("l", 2), new Command("d", 2) };
      Planimeter temp = new Planimeter(com1);
      assertEquals(8, temp.getPerimeter());
      assertEquals(true, temp.isClosedFigure());
      assertEquals(4, temp.getArea());

      Command[] com2 = {new Command("r", 3), new Command("u", 3), new Command("l", 3), new Command("d", 3) };
      temp = new Planimeter(com2);
      assertEquals(12, temp.getPerimeter());
      assertEquals(true, temp.isClosedFigure());
      assertEquals(9, temp.getArea());

      Command[] com3 = {new Command("r", 12), new Command("u", 1), new Command("l", 30),
           new Command("d", 1), new Command("r", 18) };
      temp = new Planimeter(com3);
      assertEquals(12+1+30+1+18, temp.getPerimeter());
      assertEquals(true, temp.isClosedFigure());
      assertEquals(30, temp.getArea());
      
      Command[] com4 = {new Command("r", 12), new Command("u", 1), new Command("l", 30),
           new Command("d", 1), new Command("r", 17) };
      temp = new Planimeter(com4);
      assertEquals(-1, temp.getPerimeter());
      assertEquals(false, temp.isClosedFigure());
      assertEquals(-1, temp.getArea());
    }

    public void testPlanimeter02()  // is Figure Closed only - no periemeter or Area checks
   {
      Command[] com1 = {new Command("l", 10), new Command("u", 30), new Command("r", 30), new Command("d", 40),
                                                                              new Command("l", 20), new Command("u", 10) };
      Planimeter temp = new Planimeter(com1);
      assertEquals(true, temp.isClosedFigure());

      Command[] com2 = {new Command("l", 10), new Command("u", 30), new Command("r", 30), new Command("d", 40),
                                                                              new Command("l", 20), new Command("u", 5) };
      temp = new Planimeter(com2);
      assertEquals(false, temp.isClosedFigure());

      Command[] com3 = {new Command("d", 1), new Command("r", 2), new Command("u", 4), new Command("l", 3),
                                                                              new Command("d", 3), new Command("r", 1) };
      temp = new Planimeter(com3);
      assertEquals(true, temp.isClosedFigure());


      Command[] com4 = {new Command("d", 4), new Command("r", 2), new Command("u", 8), new Command("l", 3),
                                                                              new Command("d", 3), new Command("r", 1) };
      temp = new Planimeter(com4);
      assertEquals(false, temp.isClosedFigure());
    }

    public void testPlanimeter03()  // is Figure Closed - with periemeter checks
   {
      Command[] com1 = {new Command("l", 10), new Command("u", 30), new Command("r", 30), new Command("d", 40),
                                                                              new Command("l", 20), new Command("u", 10) };
      Planimeter temp = new Planimeter(com1);
      assertEquals(true, temp.isClosedFigure());
      assertEquals(10+30+30+40+20+10, temp.getPerimeter());

      Command[] com2 = {new Command("l", 10), new Command("u", 30), new Command("r", 30), new Command("d", 40),
                                                                              new Command("l", 20), new Command("u", 5) };
      temp = new Planimeter(com2);
      assertEquals(false, temp.isClosedFigure());
      assertEquals(-1, temp.getPerimeter());

      Command[] com3 = {new Command("d", 1), new Command("r", 2), new Command("u", 4), new Command("l", 3),
                                                                              new Command("d", 3), new Command("r", 1) };
      temp = new Planimeter(com3);
      assertEquals(true, temp.isClosedFigure());
      assertEquals(1+2+4+3+3+1, temp.getPerimeter());


      Command[] com4 = {new Command("d", 4), new Command("r", 2), new Command("u", 8), new Command("l", 3),
                                                                              new Command("d", 3), new Command("r", 1) };
      temp = new Planimeter(com4);
      assertEquals(false, temp.isClosedFigure());
      assertEquals(-1, temp.getPerimeter());
    }

    public void testPlanimeter04()  // [closed figures] perimeter only
   {
      Command[] com1 = {new Command("l", 5), new Command("u", 15), new Command("r", 15), new Command("d", 20),
                                                                              new Command("l", 10), new Command("u", 5) };
      Planimeter temp = new Planimeter(com1);
      assertEquals(70, temp.getPerimeter());
//      assertEquals(true, temp.isClosedFigure());

      Command[] com2 = {new Command("d", 5), new Command("r", 10), new Command("u", 20), new Command("l", 15),
                                                                              new Command("d", 15), new Command("r", 5) };
      temp = new Planimeter(com2);
      assertEquals(70, temp.getPerimeter());
//      assertEquals(true, temp.isClosedFigure());

      Command[] com3 = {new Command("r", 55), new Command("u", 5), new Command("l", 5), new Command("u", 5), new Command("l", 5),
            new Command("u", 5), new Command("l", 5), new Command("u", 5), new Command("l", 5),  new Command("u", 5), new Command("l", 5),
            new Command("u", 5), new Command("l", 5), new Command("d", 5), new Command("l", 5),  new Command("d", 5), new Command("l", 5),
            new Command("d", 5), new Command("l", 5), new Command("d", 5), new Command("l", 5),  new Command("d", 5), new Command("l", 5),
            new Command("d", 5)    };
      temp = new Planimeter(com3);
      assertEquals(170, temp.getPerimeter());
//      assertEquals(true, temp.isClosedFigure());
    }

    public void testPlanimeter05()  // [closed figures] Area only
   {
      Command[] com1 = {new Command("l", 5), new Command("u", 15), new Command("r", 15), new Command("d", 20),
                                                                              new Command("l", 10), new Command("u", 5) };
      Planimeter temp = new Planimeter(com1);
      assertEquals(9*25+25*2, temp.getArea());

      Command[] com2 = {new Command("d", 5), new Command("r", 10), new Command("u", 20), new Command("l", 15),
                                                                              new Command("d", 15), new Command("r", 5) };
      temp = new Planimeter(com2);
      assertEquals(9*25+25*2, temp.getArea());

      Command[] com3 = {new Command("r", 55), new Command("u", 5), new Command("l", 5), new Command("u", 5), new Command("l", 5),
            new Command("u", 5), new Command("l", 5), new Command("u", 5), new Command("l", 5),  new Command("u", 5), new Command("l", 5),
            new Command("u", 5), new Command("l", 5), new Command("d", 5), new Command("l", 5),  new Command("d", 5), new Command("l", 5),
            new Command("d", 5), new Command("l", 5), new Command("d", 5), new Command("l", 5),  new Command("d", 5), new Command("l", 5),
            new Command("d", 5)    };
      temp = new Planimeter(com3);
      assertEquals(25*36, temp.getArea());
    }

    public void testPlanimeter06()  // [closed figures] perimeter only
   {
      Command[] com1 = {new Command("u", 1000), new Command("r", 300), new Command("u", 300), new Command("l", 900),
            new Command("d", 700), new Command("r", 300), new Command("d", 900), new Command("r", 800),  new Command("u", 300),
            new Command("l", 500)    };
      Planimeter temp = new Planimeter(com1);
      assertEquals(6000, temp.getPerimeter());

      Command[] com2 = {new Command("l", 4), new Command("d", 10), new Command("r", 10), new Command("u", 3),
            new Command("l", 7), new Command("u", 4), new Command("r", 3), new Command("u", 3), new Command("l", 2) };
      temp = new Planimeter(com2);
      assertEquals(4+10+10+3+7+4+3+3+2, temp.getPerimeter());

      Command[] com3 = {new Command("r", 22), new Command("d", 33), new Command("l", 33), new Command("d", 44), new Command("r", 77),
            new Command("d", 33), new Command("l", 110), new Command("u", 110), new Command("r", 44) };
      temp = new Planimeter(com3);
      assertEquals(22+33+33+44+77+33+110+110+44, temp.getPerimeter());
    }

    public void testPlanimeter07()  // [closed figures] Area only
   {
      Command[] com1 = {new Command("u", 1000), new Command("r", 300),
    new Command("u", 300), new Command("l", 900), new Command("d", 700),
    new Command("r", 300), new Command("d", 900), new Command("r", 800),
    new Command("u", 300), new Command("l", 500)    };
      Planimeter temp = new Planimeter(com1);
      assertEquals(3*7*10000+3*16*10000+3*6*10000+2*3*10000, temp.getArea());

      Command[] com2 = {new Command("l", 4), new Command("d", 10),
    new Command("r", 10), new Command("u", 3), new Command("l", 7),
    new Command("u", 4), new Command("r", 3), new Command("u", 3),
    new Command("l", 2) };
      temp = new Planimeter(com2);
      assertEquals(3*6+3*7+7*3, temp.getArea());

      Command[] com3 = {new Command("r", 22), new Command("d", 33), new Command("l", 33), new Command("d", 44), new Command("r", 77),
            new Command("d", 33), new Command("l", 110), new Command("u", 110), new Command("r", 44) };
      temp = new Planimeter(com3);
      assertEquals(60*11*11, temp.getArea());
    }

    public void testPlanimeter08()  // [closed figures] Perimeter only
   {
      Command[] com1 = { new Command("r", 7), new Command("d", 21), new Command("r", 7),
            new Command("u", 14), new Command("r", 21), new Command("u", 35), new Command("l", 21),  new Command("d", 7),
            new Command("r", 14), new Command("d", 14), new Command("l", 7), new Command("d", 7),  new Command("l", 7),
            new Command("u", 7), new Command("l", 7), new Command("u", 28), new Command("l", 42),  new Command("d", 21),
            new Command("r", 14), new Command("u", 7), new Command("l", 7), new Command("u", 7),  new Command("r", 28),
            new Command("d", 7), new Command("l", 14), new Command("d", 14), new Command("l", 21),  new Command("d", 56),
            new Command("r", 77), new Command("u", 35), new Command("l", 21), new Command("d", 7),  new Command("r", 14),
            new Command("d", 21), new Command("l", 7), new Command("u", 14), new Command("l", 14),  new Command("d", 7),
            new Command("r", 7), new Command("d", 7), new Command("l", 14), new Command("u", 14),  new Command("l", 7),
            new Command("d", 14), new Command("l", 28), new Command("u", 14), new Command("r", 7),  new Command("d", 7),
            new Command("r", 14), new Command("u", 14), new Command("l", 21), new Command("u", 7),  new Command("r", 7),
            new Command("u", 7), new Command("l", 7), new Command("u", 7), new Command("r", 14),  new Command("d", 14),
            new Command("r", 14), new Command("u", 7), new Command("l", 7), new Command("u", 21),  new Command("r", 7),
            new Command("d", 14)    };
      Planimeter temp = new Planimeter(com1);
      assertEquals(140*7, temp.getPerimeter());

      Command[] com2 = {new Command("d", 2), new Command("r", 4), new Command("d", 6), new Command("l", 10),
            new Command("u", 22), new Command("r", 2), new Command("d", 8), new Command("r", 2),  new Command("u", 6),
            new Command("r", 6), new Command("d", 6), new Command("l", 2), new Command("d", 2),  new Command("r", 2),
            new Command("d", 4), new Command("l", 4) };
      temp = new Planimeter(com2);
      assertEquals(2+4+6+10+22+2+8+2+6+6+6+2+2+2+4+4, temp.getPerimeter());

      Command[] com3 = {new Command("r", 52), new Command("u", 52), new Command("l", 26), new Command("u", 26),
            new Command("r", 26), new Command("u", 78), new Command("l", 78), new Command("d", 78),  new Command("l", 26),
            new Command("u", 104), new Command("l", 26), new Command("d", 286), new Command("r", 130),  new Command("u", 78),
            new Command("l", 52), new Command("u", 26) };
      temp = new Planimeter(com3);
      assertEquals(13*(2+4+6+10+22+2+8+2+6+6+6+2+2+2+4+4), temp.getPerimeter());
    }

    public void testPlanimeter09()  // [closed figures] Area only
   {
      Command[] com1 = { new Command("r", 7), new Command("d", 21),
       new Command("r", 7), new Command("u", 14), new Command("r", 21),
       new Command("u", 35), new Command("l", 21),  new Command("d", 7),
       new Command("r", 14), new Command("d", 14), new Command("l", 7),
       new Command("d", 7),  new Command("l", 7), new Command("u", 7),
       new Command("l", 7), new Command("u", 28), new Command("l", 42),
       new Command("d", 21), new Command("r", 14), new Command("u", 7),
       new Command("l", 7), new Command("u", 7),  new Command("r", 28),
       new Command("d", 7), new Command("l", 14), new Command("d", 14),
       new Command("l", 21),  new Command("d", 56), new Command("r", 77),
       new Command("u", 35), new Command("l", 21), new Command("d", 7),
       new Command("r", 14), new Command("d", 21), new Command("l", 7),
       new Command("u", 14), new Command("l", 14),  new Command("d", 7),
       new Command("r", 7), new Command("d", 7), new Command("l", 14),
       new Command("u", 14),  new Command("l", 7), new Command("d", 14),
       new Command("l", 28), new Command("u", 14), new Command("r", 7),
       new Command("d", 7), new Command("r", 14), new Command("u", 14),
       new Command("l", 21), new Command("u", 7),  new Command("r", 7),
       new Command("u", 7), new Command("l", 7), new Command("u", 7),
       new Command("r", 14),  new Command("d", 14), new Command("r", 14),
       new Command("u", 7), new Command("l", 7), new Command("u", 21),
       new Command("r", 7), new Command("d", 14)    };
      Planimeter temp = new Planimeter(com1);
      assertEquals((11+6+5+9+4+8+5+4+7+7+5)*7*7, temp.getArea());

      Command[] com2 = {new Command("d", 2), new Command("r", 4),
       new Command("d", 6), new Command("l", 10), new Command("u", 22),
       new Command("r", 2), new Command("d", 8), new Command("r", 2),
       new Command("u", 6), new Command("r", 6), new Command("d", 6),
       new Command("l", 2), new Command("d", 2),  new Command("r", 2),
       new Command("d", 4), new Command("l", 4) };
      temp = new Planimeter(com2);
      assertEquals((45)*4, temp.getArea());

      Command[] com3 = {new Command("r", 52), new Command("u", 52),
       new Command("l", 26), new Command("u", 26), new Command("r", 26),
       new Command("u", 78), new Command("l", 78), new Command("d", 78),
       new Command("l", 26), new Command("u", 104), new Command("l", 26),
       new Command("d", 286), new Command("r", 130),  new Command("u", 78),
       new Command("l", 52), new Command("u", 26) };
      temp = new Planimeter(com3);
      assertEquals(45*26*26, temp.getArea());
    }

    public void testPlanimeter10() 
    {
      testPlanimeter01();
      testPlanimeter02();
      testPlanimeter03();
      testPlanimeter04();
      testPlanimeter05();
      testPlanimeter06();
      testPlanimeter07();
      testPlanimeter08();
      testPlanimeter09();
    }

   public void testRubricsCube01()
   {
      RubriksCube cube = new RubriksCube();
      assertEquals("yellow", cube.getColorOfTopRowRightColumn());
      cube.topRowToTheRight();
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfMiddleRowRightColumn());

      cube.leftColumnUp();
      assertEquals("yellow", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("red", cube.getColorOfBottomRowLeftColumn());
    }

   public void testRubriksCube02()
   {
      RubriksCube cube = new RubriksCube();
      cube.topRowToTheRight();
      cube.middleRowToTheRight();
      cube.bottomRowToTheRight();
      assertEquals("white", cube.getColorOfTopRowRightColumn());
      assertEquals("white", cube.getColorOfMiddleRowRightColumn());
      assertEquals("white", cube.getColorOfBottomRowRightColumn());

      cube.leftColumnUp();
      cube.middleColumnUp();
      cube.rightColumnUp();
      assertEquals("red", cube.getColorOfTopRowLeftColumn());
      assertEquals("red", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("red", cube.getColorOfBottomRowLeftColumn());
   }

   public void testRubriksCube03()
   {
      RubriksCube cube = new RubriksCube();
      cube.topRowToTheLeft();
      cube.middleRowToTheLeft();
      cube.bottomRowToTheLeft();
      assertEquals("blue", cube.getColorOfTopRowRightColumn());
      assertEquals("blue", cube.getColorOfMiddleRowRightColumn());
      assertEquals("blue", cube.getColorOfBottomRowRightColumn());

      cube.leftColumnDown();
      cube.middleColumnDown();
      cube.rightColumnDown();
      assertEquals("orange", cube.getColorOfTopRowLeftColumn());
      assertEquals("orange", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("orange", cube.getColorOfBottomRowLeftColumn());
   }

   public void testRubriksCube04()
   {
      RubriksCube cube = new RubriksCube();
      cube.rightColumnUp();
      assertEquals("red", cube.getColorOfTopRowRightColumn());
      assertEquals("red", cube.getColorOfMiddleRowRightColumn());
      assertEquals("red", cube.getColorOfBottomRowRightColumn());

      cube = new RubriksCube();
      cube.middleColumnUp();
      assertEquals("red", cube.getColorOfTopRowMiddleColumn());
      assertEquals("red", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("red", cube.getColorOfBottomRowMiddleColumn());

      cube = new RubriksCube();
      cube.leftColumnUp();
      assertEquals("red", cube.getColorOfTopRowLeftColumn());
      assertEquals("red", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("red", cube.getColorOfBottomRowLeftColumn());

      cube = new RubriksCube();
      cube.rightColumnDown();
      assertEquals("orange", cube.getColorOfTopRowRightColumn());
      assertEquals("orange", cube.getColorOfMiddleRowRightColumn());
      assertEquals("orange", cube.getColorOfBottomRowRightColumn());

      cube = new RubriksCube();
      cube.middleColumnDown();
      assertEquals("orange", cube.getColorOfTopRowMiddleColumn());
      assertEquals("orange", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("orange", cube.getColorOfBottomRowMiddleColumn());

      cube = new RubriksCube();
      cube.leftColumnDown();
      assertEquals("orange", cube.getColorOfTopRowLeftColumn());
      assertEquals("orange", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("orange", cube.getColorOfBottomRowLeftColumn());

      cube = new RubriksCube();
      cube.topRowToTheLeft();
      assertEquals("blue", cube.getColorOfTopRowRightColumn());
      assertEquals("blue", cube.getColorOfTopRowMiddleColumn());
      assertEquals("blue", cube.getColorOfTopRowLeftColumn());

      cube = new RubriksCube();
      cube.middleRowToTheLeft();
      assertEquals("blue", cube.getColorOfMiddleRowRightColumn());
      assertEquals("blue", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("blue", cube.getColorOfMiddleRowLeftColumn());
      
      cube = new RubriksCube();
      cube.bottomRowToTheLeft();
      assertEquals("blue", cube.getColorOfBottomRowRightColumn());
      assertEquals("blue", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("blue", cube.getColorOfBottomRowLeftColumn());

      cube = new RubriksCube();
      cube.topRowToTheRight();
      assertEquals("white", cube.getColorOfTopRowRightColumn());
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("white", cube.getColorOfTopRowLeftColumn());

      cube = new RubriksCube();
      cube.middleRowToTheRight();
      assertEquals("white", cube.getColorOfMiddleRowRightColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("white", cube.getColorOfMiddleRowLeftColumn());

      cube = new RubriksCube();
      cube.bottomRowToTheRight();
      assertEquals("white", cube.getColorOfBottomRowRightColumn());
      assertEquals("white", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("white", cube.getColorOfBottomRowLeftColumn());

      cube = new RubriksCube();
      cube.rightColumnDown();
      assertEquals("orange", cube.getColorOfTopRowRightColumn());
      assertEquals("orange", cube.getColorOfMiddleRowRightColumn());
      assertEquals("orange", cube.getColorOfBottomRowRightColumn());

      cube.leftColumnDown();
      assertEquals("orange", cube.getColorOfTopRowLeftColumn());
      assertEquals("orange", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("orange", cube.getColorOfBottomRowLeftColumn());

      cube.bottomRowToTheLeft();
      assertEquals("blue", cube.getColorOfBottomRowLeftColumn());
      assertEquals("blue", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("blue", cube.getColorOfBottomRowRightColumn());

      cube.rightColumnUp();
      assertEquals("yellow", cube.getColorOfTopRowRightColumn());
      
      assertEquals("red", cube.getColorOfMiddleRowRightColumn());
      assertEquals("yellow", cube.getColorOfBottomRowRightColumn());
      cube.middleRowToTheLeft();
      cube.rightColumnDown();
      cube.topRowToTheRight();
      cube.middleColumnUp();

      assertEquals("white", cube.getColorOfTopRowLeftColumn());
      assertEquals("yellow", cube.getColorOfTopRowMiddleColumn());
      assertEquals("white", cube.getColorOfTopRowRightColumn());
 
      assertEquals("green", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("red", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("orange", cube.getColorOfMiddleRowRightColumn());

      assertEquals("blue", cube.getColorOfBottomRowLeftColumn());
      assertEquals("yellow", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("blue", cube.getColorOfBottomRowRightColumn());
   }

   public void testRubriksCube05()
   {
      RubriksCube cube = new RubriksCube();
      cube.middleRowToTheRight();
      for (int k = 0; k < 4; k++)
      {
         cube.leftColumnUp();
      }

      assertEquals("yellow", cube.getColorOfTopRowLeftColumn());
      assertEquals("yellow", cube.getColorOfTopRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfTopRowRightColumn());

      assertEquals("white", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("white", cube.getColorOfMiddleRowRightColumn());

      assertEquals("yellow", cube.getColorOfBottomRowLeftColumn());
      assertEquals("yellow", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfBottomRowRightColumn());
      
      cube = new RubriksCube();
      cube.leftColumnUp();
      cube.middleRowToTheRight();
      cube.leftColumnUp();
      cube.middleRowToTheRight();
      cube.leftColumnUp();
      cube.middleRowToTheRight();
//       
      assertEquals("orange", cube.getColorOfTopRowLeftColumn());
      assertEquals("yellow", cube.getColorOfTopRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfTopRowRightColumn());

      assertEquals("orange", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("blue", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("green", cube.getColorOfMiddleRowRightColumn());

      assertEquals("orange", cube.getColorOfBottomRowLeftColumn());
      assertEquals("yellow", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfBottomRowRightColumn());
   }

   public void testRubriksCube06()
   {
      RubriksCube cube = new RubriksCube();
      cube.rightColumnUp();
      cube.bottomRowToTheRight();
      cube.bottomRowToTheRight();

      cube.topRowToTheRight();
      cube.middleRowToTheRight();

      assertEquals("white", cube.getColorOfTopRowLeftColumn());
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("white", cube.getColorOfTopRowRightColumn());

      assertEquals("white", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("white", cube.getColorOfMiddleRowRightColumn());

      assertEquals("orange", cube.getColorOfBottomRowLeftColumn());
      assertEquals("green", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("green", cube.getColorOfBottomRowRightColumn());

      cube.rightColumnUp();
      cube.middleRowToTheRight();
      cube.leftColumnDown();
      cube.bottomRowToTheLeft();

      cube.topRowToTheRight();
      cube.middleColumnDown();
      cube.middleRowToTheLeft();

      assertEquals("blue", cube.getColorOfTopRowLeftColumn());
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("orange", cube.getColorOfTopRowRightColumn());

      assertEquals("white", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("red", cube.getColorOfMiddleRowRightColumn());

      assertEquals("white", cube.getColorOfBottomRowLeftColumn());
      assertEquals("yellow", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("red", cube.getColorOfBottomRowRightColumn());

      cube.leftColumnUp();
      cube.topRowToTheLeft();
      cube.rightColumnDown();
      cube.topRowToTheRight();
      cube.middleColumnUp();
      cube.topRowToTheLeft();
      assertEquals("yellow", cube.getColorOfTopRowLeftColumn());
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("blue", cube.getColorOfTopRowRightColumn());

      assertEquals("red", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("green", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("blue", cube.getColorOfMiddleRowRightColumn());

      assertEquals("white", cube.getColorOfBottomRowLeftColumn());
      assertEquals("red", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("green", cube.getColorOfBottomRowRightColumn());
    }

   public void testRubriksCube07()
   {
      RubriksCube cube = new RubriksCube();
      cube.rightColumnUp();
      cube.rightColumnUp();
      cube.leftColumnUp();
      cube.bottomRowToTheRight();
      cube.bottomRowToTheRight();
      cube.topRowToTheRight();
      cube.middleRowToTheRight();
      assertEquals("white", cube.getColorOfTopRowLeftColumn());
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("white", cube.getColorOfTopRowRightColumn());

      assertEquals("white", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("white", cube.getColorOfMiddleRowRightColumn());

      assertEquals("yellow", cube.getColorOfBottomRowLeftColumn());
      assertEquals("green", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("orange", cube.getColorOfBottomRowRightColumn());

      cube.rightColumnDown();
      cube.bottomRowToTheLeft();
      cube.rightColumnUp();
      cube.middleRowToTheLeft();
      cube.leftColumnDown();
      cube.bottomRowToTheRight();
      cube.middleColumnUp();
      cube.topRowToTheLeft();
      cube.middleColumnDown();
      cube.middleRowToTheRight();
      assertEquals("green", cube.getColorOfTopRowLeftColumn());
      assertEquals("orange", cube.getColorOfTopRowMiddleColumn());
      assertEquals("green", cube.getColorOfTopRowRightColumn());

      assertEquals("green", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("green", cube.getColorOfMiddleRowRightColumn());

      assertEquals("yellow", cube.getColorOfBottomRowLeftColumn());
      assertEquals("orange", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("orange", cube.getColorOfBottomRowRightColumn());
    }

   public void testRubriksCube08()
   {
      RubriksCube cube = new RubriksCube();

      cube.rightColumnDown();
      cube.leftColumnDown();
      cube.bottomRowToTheLeft();
      cube.rightColumnDown();
      cube.topRowToTheLeft();
      cube.leftColumnDown();
      cube.topRowToTheLeft();

      cube.rightColumnDown();
      cube.topRowToTheLeft();
      cube.rightColumnDown();

      cube.leftColumnDown();
      cube.topRowToTheLeft();
      cube.leftColumnDown();
      cube.middleColumnDown();
      cube.bottomRowToTheLeft();

      cube.middleRowToTheRight();
      assertEquals("red", cube.getColorOfTopRowLeftColumn());
      assertEquals("red", cube.getColorOfTopRowMiddleColumn());
      assertEquals("blue", cube.getColorOfTopRowRightColumn());

      assertEquals("yellow", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("green", cube.getColorOfMiddleRowRightColumn());

      assertEquals("blue", cube.getColorOfBottomRowLeftColumn());
      assertEquals("white", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("white", cube.getColorOfBottomRowRightColumn());

      cube.middleRowToTheRight();
      cube.middleColumnDown();
      assertEquals("red", cube.getColorOfTopRowLeftColumn());
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("blue", cube.getColorOfTopRowRightColumn());

      assertEquals("green", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("green", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("orange", cube.getColorOfMiddleRowRightColumn());

      assertEquals("blue", cube.getColorOfBottomRowLeftColumn());
      assertEquals("yellow", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("white", cube.getColorOfBottomRowRightColumn());

   }

   public void testRubriksCube09()
   {
      RubriksCube cube = new RubriksCube();
      cube.rightColumnUp();
      cube.leftColumnUp();
      cube.bottomRowToTheRight();
      cube.rightColumnUp();
      cube.topRowToTheRight();
      cube.leftColumnUp();
      cube.topRowToTheRight();

      cube.rightColumnUp();
      cube.topRowToTheRight();
      cube.rightColumnUp();

      cube.leftColumnUp();
      cube.topRowToTheRight();
      cube.leftColumnUp();

      cube.middleRowToTheRight();
      assertEquals("red", cube.getColorOfTopRowLeftColumn());
      assertEquals("green", cube.getColorOfTopRowMiddleColumn());
      assertEquals("orange", cube.getColorOfTopRowRightColumn());

      assertEquals("yellow", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("green", cube.getColorOfMiddleRowRightColumn());

      assertEquals("green", cube.getColorOfBottomRowLeftColumn());
      assertEquals("white", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("red", cube.getColorOfBottomRowRightColumn());

      cube = new RubriksCube();

      cube.rightColumnDown();
      cube.leftColumnDown();
      cube.bottomRowToTheLeft();
      cube.rightColumnDown();
      cube.topRowToTheLeft();
      cube.leftColumnDown();
      cube.topRowToTheLeft();

      cube.rightColumnDown();
      cube.topRowToTheLeft();
      cube.rightColumnDown();

      cube.leftColumnDown();
      cube.topRowToTheLeft();
      cube.leftColumnDown();

      cube.middleRowToTheRight();
      assertEquals("red", cube.getColorOfTopRowLeftColumn());
      assertEquals("blue", cube.getColorOfTopRowMiddleColumn());
      assertEquals("blue", cube.getColorOfTopRowRightColumn());

      assertEquals("yellow", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("white", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("green", cube.getColorOfMiddleRowRightColumn());

      assertEquals("green", cube.getColorOfBottomRowLeftColumn());
      assertEquals("blue", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfBottomRowRightColumn());

      cube.middleRowToTheRight();
      cube.middleColumnUp();
      cube.middleColumnUp();
      assertEquals("red", cube.getColorOfTopRowLeftColumn());
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("blue", cube.getColorOfTopRowRightColumn());

      assertEquals("green", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("yellow", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("orange", cube.getColorOfMiddleRowRightColumn());

      assertEquals("green", cube.getColorOfBottomRowLeftColumn());
      assertEquals("yellow", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfBottomRowRightColumn());
    }

   public void testRubriksCube10()
   {
      RubriksCube cube = new RubriksCube();
      cube.rightColumnDown();
      cube.leftColumnDown();
      cube.bottomRowToTheLeft();
      cube.rightColumnUp();
      cube.middleRowToTheLeft();
      cube.rightColumnDown();
      cube.topRowToTheRight();
      cube.middleColumnUp();
      assertEquals("white", cube.getColorOfTopRowLeftColumn());
      assertEquals("yellow", cube.getColorOfTopRowMiddleColumn());
      assertEquals("white", cube.getColorOfTopRowRightColumn());

      assertEquals("green", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("red", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("orange", cube.getColorOfMiddleRowRightColumn());

      assertEquals("blue", cube.getColorOfBottomRowLeftColumn());
      assertEquals("yellow", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("blue", cube.getColorOfBottomRowRightColumn());

      cube = new RubriksCube();
      cube.rightColumnUp();
      cube.leftColumnUp();
      cube.bottomRowToTheRight();
      cube.rightColumnUp();
      cube.middleRowToTheRight();
      cube.rightColumnDown();
      cube.topRowToTheLeft();
      cube.middleColumnDown();
      assertEquals("blue", cube.getColorOfTopRowLeftColumn());
      assertEquals("yellow", cube.getColorOfTopRowMiddleColumn());
      assertEquals("blue", cube.getColorOfTopRowRightColumn());

      assertEquals("white", cube.getColorOfMiddleRowLeftColumn());
      assertEquals("orange", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("red", cube.getColorOfMiddleRowRightColumn());

      assertEquals("white", cube.getColorOfBottomRowLeftColumn());
      assertEquals("yellow", cube.getColorOfBottomRowMiddleColumn());
      assertEquals("white", cube.getColorOfBottomRowRightColumn());
   }

   public void testRunRunRunAroundNumbers01()
   {
      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      assertEquals(true, rrr.isRunRoundNumber(13));
      assertEquals(true, rrr.isRunRoundNumber(81362));
      assertEquals(true, rrr.isRunRoundNumber(913425));
      assertEquals(false, rrr.isRunRoundNumber(123));
      assertEquals(false, rrr.isRunRoundNumber(81111));
      assertEquals(false, rrr.isRunRoundNumber(83333));

      assertEquals(147, rrr.getNextRunAroundNumber(123));
      assertEquals(81236, rrr.getNextRunAroundNumber(81111));
      assertEquals(83491, rrr.getNextRunAroundNumber(83333));
   }

   public void testRunRunRunAroundNumbers02()
   {
      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      assertEquals(true, rrr.isRunRoundNumber(147));
      assertEquals(true, rrr.isRunRoundNumber(258));
      assertEquals(true, rrr.isRunRoundNumber(134259));
      assertEquals(true, rrr.isRunRoundNumber(67241));
      assertEquals(true, rrr.isRunRoundNumber(1246895));
   }

   public void testRunRunRunAroundNumbers03()
   {
      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      assertEquals(true, rrr.isRunRoundNumber(147));
      assertEquals(true, rrr.isRunRoundNumber(258));
      assertEquals(true, rrr.isRunRoundNumber(134259));
      assertEquals(true, rrr.isRunRoundNumber(67241));
      assertEquals(true, rrr.isRunRoundNumber(1246895));

      assertEquals(147, rrr.getNextRunAroundNumber(111));
      assertEquals(258, rrr.getNextRunAroundNumber(222));
      assertEquals(134259, rrr.getNextRunAroundNumber(123456));
      assertEquals(1246895, rrr.getNextRunAroundNumber(1086423));
   }

   public void testRunRunRunAroundNumbers04()
   {
      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      assertEquals(true, rrr.isRunRoundNumber(417));
      assertEquals(true, rrr.isRunRoundNumber(12368));
      assertEquals(true, rrr.isRunRoundNumber(258));
      assertEquals(true, rrr.isRunRoundNumber(471));
      assertEquals(true, rrr.isRunRoundNumber(12746));

      assertEquals(174, rrr.getNextRunAroundNumber(148));
      assertEquals(417, rrr.getNextRunAroundNumber(417));
      assertEquals(23186, rrr.getNextRunAroundNumber(20468));
      assertEquals(15, rrr.getNextRunAroundNumber(14));
   }

   public void testRunRunRunAroundNumbers05()
   {
      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      assertEquals(true, rrr.isRunRoundNumber(528));
      assertEquals(true, rrr.isRunRoundNumber(1426958));
      assertEquals(true, rrr.isRunRoundNumber(13628));
      assertEquals(true, rrr.isRunRoundNumber(3526));
      assertEquals(true, rrr.isRunRoundNumber(89247));

      assertEquals(51, rrr.getNextRunAroundNumber(51));
      assertEquals(285, rrr.getNextRunAroundNumber(259));
      assertEquals(23974, rrr.getNextRunAroundNumber(23974));
      assertEquals(134259, rrr.getNextRunAroundNumber(98765));
   }

   public void testRunRunRunAroundNumbers06()
   {
      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      assertEquals(true, rrr.isRunRoundNumber(72416));
      assertEquals(true, rrr.isRunRoundNumber(91));
      assertEquals(true, rrr.isRunRoundNumber(2316));
      assertEquals(true, rrr.isRunRoundNumber(78924));
      assertEquals(true, rrr.isRunRoundNumber(79));

      assertEquals(71, rrr.getNextRunAroundNumber(66));
      assertEquals(147, rrr.getNextRunAroundNumber(101));
      assertEquals(5263, rrr.getNextRunAroundNumber(4795));
      assertEquals(714, rrr.getNextRunAroundNumber(604));
   }

   public void testRunRunRunAroundNumbers07()
   {
      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      assertEquals(true, rrr.isRunRoundNumber(714));
      assertEquals(true, rrr.isRunRoundNumber(295314));
      assertEquals(true, rrr.isRunRoundNumber(13628));

      assertEquals(9263, rrr.getNextRunAroundNumber(8246));
      assertEquals(6231, rrr.getNextRunAroundNumber(6051));
      assertEquals(1623, rrr.getNextRunAroundNumber(1604));
      assertEquals(3526, rrr.getNextRunAroundNumber(3333));
   }

   public void testRunRunRunAroundNumbers08()
   {
      testRunRunRunAroundNumbers02();
      testRunRunRunAroundNumbers03();

      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      for (int i = 1605; i < 1623; i++)
         assertEquals(1623, rrr.getNextRunAroundNumber(i));
   }

   public void testRunRunRunAroundNumbers09()
   {
      testRunRunRunAroundNumbers04();
      testRunRunRunAroundNumbers05();

      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      for (int i = 606; i < 714; i+=+2)
         assertEquals(714, rrr.getNextRunAroundNumber(i));
   }

   public void testRunRunRunAroundNumbers10()
   {
      testRunRunRunAroundNumbers06();
      testRunRunRunAroundNumbers07();

      RunRunRunAroundNumbers rrr = new RunRunRunAroundNumbers();

      for (int i = 223; i < 258; i+=+2)
         assertEquals(258, rrr.getNextRunAroundNumber(i));
   }

   public void testTelephoneDirectory01()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("java");
      employees.add("johns");
      employees.add("johnson");
      employees.add("smith");
      TelephoneDirectory td = new TelephoneDirectory(employees);

      ArrayList<String> sol = td.getEmployees("5282");
      assertEquals(1, sol.size());
      assertEquals("java", sol.get(0));

      sol = td.getEmployees("5");
      assertEquals(3, sol.size());
      assertEquals(true, sol.contains("java"));
      assertEquals(true, sol.contains("johns"));
      assertEquals(true, sol.contains("johnson"));

      sol = td.getEmployees("5646");
      assertEquals(2, sol.size());
      assertEquals(true, sol.contains("johns"));
      assertEquals(true, sol.contains("johnson"));
   }

   public void testTelephoneDirectory02()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("rogers");
      employees.add("koci");
      employees.add("rodriguez");
      employees.add("roach");
      employees.add("booze");
      employees.add("simpson");
      employees.add("hui");
      employees.add("sanchez");
      employees.add("chung");
      employees.add("turner");
      employees.add("smith");
      employees.add("mcknight");
      employees.add("johnson");
      employees.add("adams");
      employees.add("dyer");
      employees.add("downs");
      employees.add("gomez");
      employees.add("gonzales");
      employees.add("lo");
      employees.add("lee");
      employees.add("kim");
      employees.add("young");
      employees.add("zhaung");
      employees.add("wen");
      employees.add("yho");
      employees.add("yao");
      employees.add("clark");
      employees.add("madrid");
      employees.add("goodman");
      employees.add("coglianese");
      employees.add("armstrong");
      employees.add("bush");
      employees.add("clifton");
      employees.add("trees");
      TelephoneDirectory td = new TelephoneDirectory(employees);

      ArrayList<String> sol = td.getEmployees("9");  // beings with w,x,y or z
// zhaung, wen, yho, yao, young
      assertEquals(5, sol.size());
      assertEquals(true, sol.contains("zhaung"));
      assertEquals(true, sol.contains("wen"));
      assertEquals(true, sol.contains("yho"));
      assertEquals(true, sol.contains("yao"));
      assertEquals(true, sol.contains("young"));

      sol = td.getEmployees("94");  // [w,x,y or z] [g, h or i]
// zhaung, yho 
      assertEquals(2, sol.size());
      assertEquals(true, sol.contains("zhaung"));
      assertEquals(true, sol.contains("yho"));

      sol = td.getEmployees("2");  // [a,b or c]
      String[] ans1 = { "booze", "chung", "adams", "clark", "coglianese",
                                              "armstrong", "bush", "clifton"};

      assertEquals(ans1.length, sol.size());
      for(String a : ans1)
         assertEquals(true, sol.contains(a));

      sol = td.getEmployees("26");  // [a,b or c] [m, n or o]
      String[] ans2 = { "booze", "coglianese"};

      assertEquals(ans2.length, sol.size());
      for(String a : ans2)
         assertEquals(true, sol.contains(a));

      sol = td.getEmployees("266");  // [a,b or c] [m, n or o]
      String[] ans3 = { "booze"};

      assertEquals(ans3.length, sol.size());
      for(String a : ans3)
         assertEquals(true, sol.contains(a));
   }

   public void testTelephoneDirectory03()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("Ewing");
      employees.add("Rogers");
      employees.add("Koci");
      employees.add("Rodriguez");
      employees.add("Roach");
      employees.add("Booze");
      employees.add("Simpson");
      employees.add("Hui");
      employees.add("Sanchez");
      employees.add("Chung");
      employees.add("Turner");
      employees.add("Smith");
      employees.add("Mcknight");
      employees.add("Johnson");
      employees.add("Adams");
      employees.add("Dyer");
      employees.add("Downs");
      employees.add("Gomez");
      employees.add("Gonzales");
      employees.add("Lo");
      employees.add("Lee");
      employees.add("Kim");
      employees.add("Young");
      employees.add("Zhaung");
      employees.add("Wen");
      employees.add("Yho");
      employees.add("Yao");
      employees.add("Clark");
      employees.add("Dvarenk");
      employees.add("Madrid");
      employees.add("Goodman");
      employees.add("Coglianese");
      employees.add("Armstrong");
      employees.add("Bush");
      employees.add("Evans");
      employees.add("Clifton");
      employees.add("Trees");
      TelephoneDirectory td = new TelephoneDirectory(employees);

      ArrayList<String> sol= td.getEmployees("3");  // [d, e or f]
      String[] ans1 = { "Dyer", "Downs", "Evans", "Ewing", "Dvarenk"};

      assertEquals(ans1.length, sol.size());
      for(String a : ans1)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("38");  // [d, e or f], [t, u or v]
      String[] ans2 = { "Evans", "Dvarenk"};

      assertEquals(ans2.length, sol.size());
      for(String a : ans2)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("3827");  // [d, e or f], [t, u or v], [a, b or c], [p, r or s]
      String[] ans3 = {"Dvarenk"};

      assertEquals(ans3.length, sol.size());
      for(String a : ans3)
         assertEquals(true, sol.contains(a));
   }

   public void testTelephoneDirectory04()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("Ewing");
      employees.add("rogers");
      employees.add("Koci");
      employees.add("Rodriguez");
      employees.add("opperheimer");
      employees.add("Roach");
      employees.add("booze");
      employees.add("simpson");
      employees.add("Hui");
      employees.add("Sanchez");
      employees.add("chung");
      employees.add("turner");
      employees.add("Smith");
      employees.add("McKnight");
      employees.add("Johnson");
      employees.add("adams");
      employees.add("Dyer");
      employees.add("downs");
      employees.add("McWaters");
      employees.add("gomez");
      employees.add("Gonzales");
      employees.add("Lo");
      employees.add("lee");
      employees.add("Kim");
      employees.add("young");
      employees.add("Zhaung");
      employees.add("Wen");
      employees.add("Yho");
      employees.add("yao");
      employees.add("Clark");
      employees.add("Newton");
      employees.add("Dvarenk");
      employees.add("SanMadrid");
      employees.add("Goodman");
      employees.add("Coglianese");
      employees.add("patterson");
      employees.add("StArmstrong");
      employees.add("Bush");
      employees.add("Evans");
      employees.add("dClifton");
      employees.add("Trees");
      employees.add("OSmiley");
      TelephoneDirectory td = new TelephoneDirectory(employees);

      ArrayList<String> sol= td.getEmployees("6");  // [m, n or o]
      String[] ans1 = {  "McKnight", "Newton", "McWaters", "opperheimer", "OSmiley"};

      assertEquals(ans1.length, sol.size());
      for(String a : ans1)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("62");  // [m, n or o], [a, b or c]
      String[] ans2 = {"McKnight", "McWaters"};

      assertEquals(ans2.length, sol.size());
      for(String a : ans2)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("625");  // [m, n or o], [a, b or c], [j, k or l]
      String[] ans3 = {"McKnight"};

      assertEquals(ans3.length, sol.size());
      for(String a : ans3)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("7");  // [p, q, r or s]
      String[] ans4 = {"rogers", "Rodriguez", "Roach", "simpson", "Sanchez", "Smith", "SanMadrid",
                       "StArmstrong", "patterson"};

      assertEquals(ans4.length, sol.size());
      for(String a : ans4)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("78");  // [p, q, r or s], [t, u or v]
      String[] ans5 = {"StArmstrong"};

      assertEquals(ans5.length, sol.size());
      for(String a : ans5)
         assertEquals(true, sol.contains(a));
   }

   public void testTelephoneDirectory05()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("Ewing");
      employees.add("rogers");
      employees.add("Koci");
      employees.add("Rodriguez");
      employees.add("opperheimer");
      employees.add("Roach");
      employees.add("booze");
      employees.add("simpson");
      employees.add("Hui");
      employees.add("Sanchez");
      employees.add("chung");
      employees.add("turner");
      employees.add("Smith");
      employees.add("McKnight");
      employees.add("Johnson");
      employees.add("adams");
      employees.add("Dyer");
      employees.add("downs");
      employees.add("McWaters");
      employees.add("gomez");
      employees.add("Gonzales");
      employees.add("Lo");
      employees.add("lee");
      employees.add("machon");
      employees.add("Kim");
      employees.add("young");
      employees.add("Zhaung");
      employees.add("Wen");
      employees.add("Yho");
      employees.add("yao");
      employees.add("Clark");
      employees.add("Newton");
      employees.add("fin");
      employees.add("Dvarenk");
      employees.add("SanMadrid");
      employees.add("Goodman");
      employees.add("needles");
      employees.add("Coglianese");
      employees.add("patterson");
      employees.add("StArmstrong");
      employees.add("Bush");
      employees.add("Evans");
      employees.add("jeffs");
      employees.add("dClifton");
      employees.add("Trees");
      employees.add("Fitt");
      employees.add("OSmiley");
      employees.add("everett");
      employees.add("Avery");
      employees.add("keys");
      employees.add("Islound");
      employees.add("huyn");
      employees.add("igles");
      employees.add("Qui");
      employees.add("quince");
      employees.add("Putt");
      employees.add("Uyn");
      employees.add("voltin");
      employees.add("Vazzvof");
      employees.add("unru");
      employees.add("XXyz");
      employees.add("zin");
      employees.add("xyong");
      TelephoneDirectory td = new TelephoneDirectory(employees);

      ArrayList<String> sol= td.getEmployees("2");  // [a, b or c]
      String[] ans1 = {"booze", "chung", "adams", "Clark", "Coglianese", "Bush", "Avery"};

      assertEquals(ans1.length, sol.size());
      for(String a : ans1)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("3");  // [d, e or f]
      String[] ans2 = { "Ewing", "Dyer", "downs", "Dvarenk", "Evans", "dClifton", "everett", "Fitt", "fin"};

      assertEquals(ans2.length, sol.size());
      for(String a : ans2)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("4");  //  [g, h or i]
      String[] ans3 = {"Hui", "gomez", "Islound", "Gonzales", "huyn", "igles", "Goodman"}; 

      assertEquals(ans3.length, sol.size());
      for(String a : ans3)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("5");  // [j, k, or l]
      String[] ans5 = { "Koci", "Johnson", "Lo", "lee", "Kim", "keys", "jeffs"};

      assertEquals(ans5.length, sol.size());
      for(String a : ans5)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("6");  //  [m, n or o]
      String[] ans6 = { "McKnight", "Newton", "McWaters", "opperheimer", "OSmiley", "needles", "machon"};

      assertEquals(ans6.length, sol.size());
      for(String a : ans6)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("7");  // [p, q, r or s]
      String[] ans7 = {"rogers","Rodriguez", "Roach", "simpson", "Sanchez", "Smith", "patterson", "SanMadrid", "StArmstrong",
                       "Qui", "quince", "Putt"};

      assertEquals(ans7.length, sol.size());
      for(String a : ans7)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("8");  //  [t, u or v]
      String[] ans8 = { "turner", "Trees",  "unru", "Uyn", "voltin", "Vazzvof"};

      assertEquals(ans8.length, sol.size());
      for(String a : ans8)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("9");  //  [w, x, y or z]
      String[] ans9 = {"young", "Zhaung", "Wen", "Yho", "yao", "zin", "XXyz", "xyong"};
      assertEquals(ans9.length, sol.size());
      for(String a : ans9)
         assertEquals(true, sol.contains(a));
   }

   public void testTelephoneDirectory06()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("Ewing");
      employees.add("rogers");
      employees.add("Koci");
      employees.add("Rodriguez");
      employees.add("opperheimer");
      employees.add("Roach");
      employees.add("booze");
      employees.add("simpson");
      employees.add("Hui");
      employees.add("Sanchez");
      employees.add("chung");
      employees.add("turner");
      employees.add("Smith");
      employees.add("McKnight");
      employees.add("Johnson");
      employees.add("adams");
      employees.add("Dyer");
      employees.add("downs");
      employees.add("McWaters");
      employees.add("gomez");
      employees.add("Gonzales");
      employees.add("Lo");
      employees.add("lee");
      employees.add("machon");
      employees.add("Kim");
      employees.add("young");
      employees.add("Zhaung");
      employees.add("Wen");
      employees.add("Yho");
      employees.add("yao");
      employees.add("Clark");
      employees.add("Newton");
      employees.add("fin");
      employees.add("Dvarenk");
      employees.add("SanMadrid");
      employees.add("Goodman");
      employees.add("needles");
      employees.add("Coglianese");
      employees.add("patterson");
      employees.add("StArmstrong");
      employees.add("Bush");
      employees.add("Evans");
      employees.add("jeffs");
      employees.add("dClifton");
      employees.add("Trees");
      employees.add("Fitt");
      employees.add("OSmiley");
      employees.add("everett");
      employees.add("Avery");
      employees.add("keys");
      employees.add("Islound");
      employees.add("huyn");
      employees.add("igles");
      employees.add("Qui");
      employees.add("quince");
      employees.add("Putt");
      employees.add("Uyn");
      employees.add("voltin");
      employees.add("Vazzvof");
      employees.add("unru");
      employees.add("XXyz");
      employees.add("zin");
      employees.add("xyong");
      TelephoneDirectory td = new TelephoneDirectory(employees);

      ArrayList<String> sol= td.getEmployees("23");  // [a, b or c] [d, e or f]
      String[] ans1 = {"adams"};

      assertEquals(ans1.length, sol.size());
      for(String a : ans1)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("34");  // [d, e or f] [g, h or i]
      String[] ans2 = { "Fitt", "fin"};

      assertEquals(ans2.length, sol.size());
      for(String a : ans2)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("346");  // [d, e or f] [g, h or i] [m, n or o]
      String[] ans3 = { "fin"};

      assertEquals(ans3.length, sol.size());
      for(String a : ans3)
         assertEquals(true, sol.contains(a));
   }

   public void testTelephoneDirectory07()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("Ewing");
      employees.add("rogers");
      employees.add("Koci");
      employees.add("Rodriguez");
      employees.add("opperheimer");
      employees.add("Roach");
      employees.add("booze");
      employees.add("simpson");
      employees.add("Hui");
      employees.add("Sanchez");
      employees.add("chung");
      employees.add("turner");
      employees.add("Smith");
      employees.add("McKnight");
      employees.add("Johnson");
      employees.add("adams");
      employees.add("Dyer");
      employees.add("downs");
      employees.add("McWaters");
      employees.add("gomez");
      employees.add("Gonzales");
      employees.add("Lo");
      employees.add("lee");
      employees.add("machon");
      employees.add("Kim");
      employees.add("young");
      employees.add("Zhaung");
      employees.add("Wen");
      employees.add("Yho");
      employees.add("yao");
      employees.add("Clark");
      employees.add("Newton");
      employees.add("fin");
      employees.add("Dvarenk");
      employees.add("SanMadrid");
      employees.add("Goodman");
      employees.add("needles");
      employees.add("Coglianese");
      employees.add("patterson");
      employees.add("StArmstrong");
      employees.add("Bush");
      employees.add("Evans");
      employees.add("jeffs");
      employees.add("dClifton");
      employees.add("Trees");
      employees.add("Fitt");
      employees.add("OSmiley");
      employees.add("everett");
      employees.add("Avery");
      employees.add("keys");
      employees.add("Islound");
      employees.add("huyn");
      employees.add("igles");
      employees.add("Qui");
      employees.add("quince");
      employees.add("Putt");
      employees.add("Uyn");
      employees.add("voltin");
      employees.add("Vazzvof");
      employees.add("unru");
      employees.add("XXyz");
      employees.add("zin");
      employees.add("xyong");
      TelephoneDirectory td = new TelephoneDirectory(employees);

      ArrayList<String> sol= td.getEmployees("466");  //  [g, h or i] [m, n or o]  [m, n or o]
      String[] ans3 = {"gomez", "Gonzales", "Goodman"}; 
      assertEquals(ans3.length, sol.size());
      for(String a : ans3)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("4669");  //  [g, h or i] [m, n or o] [m, n or o] [w, x, y or z]
      String[] ans4 = {"Gonzales"}; 

      assertEquals(ans4.length, sol.size());
      for(String a : ans4)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("53");  // [j, k, or l] [d, e or f]
      String[] ans5 = { "lee", "keys", "jeffs"};
      assertEquals(ans5.length, sol.size());
      for(String a : ans5)
         assertEquals(true, sol.contains(a));
   }

   public void testTelephoneDirectory08()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("Ewing");
      employees.add("rogers");
      employees.add("Koci");
      employees.add("Rodriguez");
      employees.add("opperheimer");
      employees.add("Roach");
      employees.add("booze");
      employees.add("simpson");
      employees.add("Hui");
      employees.add("Sanchez");
      employees.add("chung");
      employees.add("turner");
      employees.add("Smith");
      employees.add("McKnight");
      employees.add("Johnson");
      employees.add("adams");
      employees.add("Dyer");
      employees.add("downs");
      employees.add("McWaters");
      employees.add("gomez");
      employees.add("Gonzales");
      employees.add("Lo");
      employees.add("lee");
      employees.add("machon");
      employees.add("Kim");
      employees.add("young");
      employees.add("Zhaung");
      employees.add("Wen");
      employees.add("Yho");
      employees.add("yao");
      employees.add("Clark");
      employees.add("Newton");
      employees.add("fin");
      employees.add("Dvarenk");
      employees.add("SanMadrid");
      employees.add("Goodman");
      employees.add("needles");
      employees.add("Coglianese");
      employees.add("patterson");
      employees.add("StArmstrong");
      employees.add("Bush");
      employees.add("Evans");
      employees.add("jeffs");
      employees.add("dClifton");
      employees.add("Trees");
      employees.add("Fitt");
      employees.add("OSmiley");
      employees.add("everett");
      employees.add("Avery");
      employees.add("keys");
      employees.add("Islound");
      employees.add("huyn");
      employees.add("igles");
      employees.add("Qui");
      employees.add("quince");
      employees.add("Putt");
      employees.add("Uyn");
      employees.add("voltin");
      employees.add("Vazzvof");
      employees.add("unru");
      employees.add("XXyz");
      employees.add("zin");
      employees.add("xyong");
      TelephoneDirectory td = new TelephoneDirectory(employees);   

      ArrayList<String> sol= td.getEmployees("63");  //  [m, n or o] [d, e or f]
      String[] ans6 = { "Newton", "needles"};

      assertEquals(ans6.length, sol.size());
      for(String a : ans6)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("639");  //  [m, n or o] [d, e or f] [w, x, y or z]
      String[] ans7 = { "Newton"};

      assertEquals(ans7.length, sol.size());
      for(String a : ans7)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("6396");  //  [m, n or o] [d, e or f] [w, x, y or z] [m, n or o]
      String[] ans8 = {};

      assertEquals(ans8.length, sol.size());
      for(String a : ans8)
         assertEquals(true, sol.contains(a));
   }

   public void testTelephoneDirectory09()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("Ewing");
      employees.add("rogers");
      employees.add("Koci");
      employees.add("Rodriguez");
      employees.add("opperheimer");
      employees.add("Roach");
      employees.add("booze");
      employees.add("simpson");
      employees.add("Hui");
      employees.add("Sanchez");
      employees.add("chung");
      employees.add("turner");
      employees.add("Smith");
      employees.add("McKnight");
      employees.add("Johnson");
      employees.add("adams");
      employees.add("Dyer");
      employees.add("downs");
      employees.add("McWaters");
      employees.add("gomez");
      employees.add("Gonzales");
      employees.add("Lo");
      employees.add("lee");
      employees.add("machon");
      employees.add("Kim");
      employees.add("young");
      employees.add("Zhaung");
      employees.add("Wen");
      employees.add("Yho");
      employees.add("yao");
      employees.add("Clark");
      employees.add("Newton");
      employees.add("fin");
      employees.add("Dvarenk");
      employees.add("SanMadrid");
      employees.add("Goodman");
      employees.add("needles");
      employees.add("Coglianese");
      employees.add("patterson");
      employees.add("StArmstrong");
      employees.add("Bush");
      employees.add("Evans");
      employees.add("jeffs");
      employees.add("dClifton");
      employees.add("Trees");
      employees.add("Fitt");
      employees.add("OSmiley");
      employees.add("everett");
      employees.add("Avery");
      employees.add("keys");
      employees.add("Islound");
      employees.add("huyn");
      employees.add("igles");
      employees.add("Qui");
      employees.add("quince");
      employees.add("Putt");
      employees.add("Uyn");
      employees.add("voltin");
      employees.add("Vazzvof");
      employees.add("unru");
      employees.add("XXyz");
      employees.add("zin");
      employees.add("xyong");
      TelephoneDirectory td = new TelephoneDirectory(employees);   

      ArrayList<String> sol= td.getEmployees("74");  // [p, q, r or s] [g, h, or i]
      String[] ans1 = {"simpson"};

      assertEquals(ans1.length, sol.size());
      for(String a : ans1)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("87");  //  [t, u or v] [p, q, r or s]
      String[] ans2 = { "Trees"};
      assertEquals(ans2.length, sol.size());
      for(String a : ans2)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("829986");  //  [t, u or v] [a, b or c]  [w, x, y or z]  [w, x, y or z] [t, u or v] [m, n or o]  [d, e or f]
      String[] ans3 = { "Vazzvof"};
      assertEquals(ans3.length, sol.size());
      for(String a : ans3)
         assertEquals(true, sol.contains(a));
   }


   public void testTelephoneDirectory10()
   {
      ArrayList<String> employees = new ArrayList<String>();
      employees.add("Ewing");
      employees.add("rogers");
      employees.add("Koci");
      employees.add("Rodriguez");
      employees.add("opperheimer");
      employees.add("Roach");
      employees.add("booze");
      employees.add("simpson");
      employees.add("Hui");
      employees.add("Sanchez");
      employees.add("chung");
      employees.add("turner");
      employees.add("Smith");
      employees.add("McKnight");
      employees.add("Johnson");
      employees.add("adams");
      employees.add("Dyer");
      employees.add("downs");
      employees.add("McWaters");
      employees.add("gomez");
      employees.add("Gonzales");
      employees.add("Lo");
      employees.add("lee");
      employees.add("machon");
      employees.add("Kim");
      employees.add("young");
      employees.add("Zhaung");
      employees.add("Wen");
      employees.add("Yho");
      employees.add("yao");
      employees.add("Clark");
      employees.add("Newton");
      employees.add("fin");
      employees.add("Dvarenk");
      employees.add("SanMadrid");
      employees.add("Goodman");
      employees.add("needles");
      employees.add("Coglianese");
      employees.add("patterson");
      employees.add("StArmstrong");
      employees.add("Bush");
      employees.add("Evans");
      employees.add("jeffs");
      employees.add("dClifton");
      employees.add("Trees");
      employees.add("Fitt");
      employees.add("OSmiley");
      employees.add("everett");
      employees.add("Avery");
      employees.add("keys");
      employees.add("Islound");
      employees.add("huyn");
      employees.add("igles");
      employees.add("Qui");
      employees.add("quince");
      employees.add("Putt");
      employees.add("Uyn");
      employees.add("voltin");
      employees.add("Vazzvof");
      employees.add("unru");
      employees.add("XXyz");
      employees.add("zin");
      employees.add("xyong");
      TelephoneDirectory td = new TelephoneDirectory(employees);   

      ArrayList<String> sol= td.getEmployees("99");  // [w, x, y or z] [w, x, y or z]
      String[] ans1 = {"XXyz", "xyong"};
      assertEquals(ans1.length, sol.size());
      for(String a : ans1)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("999");  // [w, x, y or z] [w, x, y or z] [w, x, y or z]
      String[] ans2 = {"XXyz"};
      assertEquals(ans2.length, sol.size());
      for(String a : ans2)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("94");  //  [w, x, y or z] [g, h or i]
      String[] ans3 = {"Zhaung", "Yho", "zin"};
      assertEquals(ans3.length, sol.size());
      for(String a : ans3)
         assertEquals(true, sol.contains(a));

      sol= td.getEmployees("942");  //  [w, x, y or z] [g, h or i] [a, b or c]
      String[] ans4 = {"Zhaung"};
      assertEquals(ans4.length, sol.size());
      for(String a : ans4)
         assertEquals(true, sol.contains(a));
   }

   public void testZerosAndOnes01()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(6, 3);
      int[] ans1 = { 42 };
      assertEquals(1, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));

      sol = ZerosAndOnes.getNumbers(6, 4);
      int[] ans2 = { 32+16+8, 32+16+4, 32+8+4 };
      assertEquals(ans2.length, sol.size());
      for (int i = 0; i < ans2.length; i++)
         assertEquals(true, sol.contains(ans2[i]));

      sol = ZerosAndOnes.getNumbers(6, 2);
      int[] ans3 = { 32+16+8, 32+16+4, 32+8+4, 32+16+2, 32+8+2, 32+4+2 };
      assertEquals(ans3.length, sol.size());
      for (int i = 0; i < ans3.length; i++)
         assertEquals(true, sol.contains(ans3[i]));

      sol = ZerosAndOnes.getNumbers(8, 8);
      int[] ans4 = { 240, 232, 216, 184 };
      assertEquals(ans4.length, sol.size());
      for (int i = 0; i < ans4.length; i++)
         assertEquals(true, sol.contains(ans4[i]));
   }

   public void testZerosAndOnes02()
   {
      for (int k = 3; k < 3 + 25*4; k +=4)
      {
         assertEquals(0, ZerosAndOnes.getNumbers(k, 2).size());
         assertEquals(0, ZerosAndOnes.getNumbers(k, 3).size());
      }
   }

   public void testZerosAndOnes03()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(8, 3);   // 128 64 32 16 8 4 2 1
      int[] ans1 = {128+64+32+16, 128+64+32+4, 128+64+32+1,128+64+16+8, 128+64+16+2, 128+64+8+4, 128+64+8+1, 128+64+4+2,
                    128+64+2+1, 128+32+16+4, 128+32+16+1, 128+32+4+1, 128+16+8+4, 128+16+8+1, 128+16+4+2, 128+16+2+1, 
                    128+8+4+1, 128+4+2+1};
      assertEquals(ans1.length, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));

      sol = ZerosAndOnes.getNumbers(8, 8);   // 128 64 32 16 8 4 2 1
      int[] ans2 = { 128+64+32+16, 128+64+32+8, 128+64+16+8, 128+32+16+8};
      assertEquals(ans2.length, sol.size());
      for (int i = 0; i < ans2.length; i++)
         assertEquals(true, sol.contains(ans2[i]));

      sol = ZerosAndOnes.getNumbers(8, 4);
      int[] ans3 = {128+64+32+16, 128+64+32+8, 128+64+32+4, 128+64+16+8, 128+32+16+4, 128+32+8+4,
                     128+32+16+8, 128+32+16+4, 128+32+8+4, 128+16+8+4};
      assertEquals(ans3.length, sol.size());

      sol = ZerosAndOnes.getNumbers(8, 2);
      int[] ans4 = {  128+64+32+16, 128+64+32+8, 128+64+32+4, 128+64+32+2, 128+64+16+8, 128+64+16+4, 
                      128+64+16+2, 128+64+8+4, 128+64+8+2, 128+64+4+2, 128+32+16+8, 128+32+16+4, 128+32+16+2,
                      128+32+8+4, 128+32+8+2, 128+32+4+2, 128+16+8+4,  128+16+8+2, 128+16+4+2, 128+8+4+2};
//      for (int i = 0; i < sol.size(); i++)
//         System.out.println("contents 1 " +  sol.get(i));
      assertEquals(ans4.length, sol.size());
      for (int i = 0; i < ans3.length; i++)
         assertEquals(true, sol.contains(ans3[i]));
   }

   public void testZerosAndOnes04()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(12, 15);
      int[] ans1 = {2205, 2265, 2355, 2445, 2460, 2505, 2520, 2730, 2835, 2865, 3150, 3180, 3225, 3270, 3300, 3465, 3480,
                    3660, 3780};
      assertEquals(ans1.length, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));

   }
// double check these
   public void testZerosAndOnes05()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(10, 11);
      int[] ans1 = {539, 572, 583, 682, 737, 781, 803, 880, 902, 913, 968};
      assertEquals(ans1.length, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));
   }
   
   public void testZerosAndOnes06()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(10, 5);
      int[] ans1 = {535, 555, 565, 570, 590, 595, 620, 625, 665, 675, 690, 710, 740, 775, 790, 805, 810, 820, 835, 850,
                    865, 880, 905, 920, 930};
      assertEquals(ans1.length, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));
   }

   public void testZerosAndOnes07()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(14, 91);
      int[] ans1 = {8918, 9373, 9464, 9555, 10010, 10192, 10556, 10829, 11466, 11557, 11921, 12467, 12649, 13468, 13650,
                    14924, 15379, 15652, 16016};
      assertEquals(ans1.length, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));
   }
   
   public void testZerosAndOnes08()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(18, 1321);
      int[] ans1 = {138705, 140026, 143989, 151915, 157199, 158520, 161162, 170409, 180977, 183619, 184940, 192866, 
                    203434, 215323, 219286, 221928, 231175, 233817, 248348, 256274};
      assertEquals(ans1.length, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));
   }
   
   public void testZerosAndOnes09()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(10, 32);
      int[] ans1 = {992};
      assertEquals(ans1.length, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));

      sol = ZerosAndOnes.getNumbers(12, 32);
      int[] ans2 = {3040, 3552, 3808, 3936, 4000, 4032};
      assertEquals(ans2.length, sol.size());
      for (int i = 0; i < ans2.length; i++)
         assertEquals(true, sol.contains(ans2[i]));
   }

   public void testZerosAndOnes10()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(16, 128);
      int[] ans1 = {49024, 57216, 61312, 63360, 64384, 64896, 65152, 65280};
      assertEquals(ans1.length, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));

      sol = ZerosAndOnes.getNumbers(18, 1024);
      assertEquals(0, sol.size());

      sol = ZerosAndOnes.getNumbers(18, 256);
      int[] ans2 = {196352, 229120, 245504, 253696, 257792, 259840, 260864, 261376, 261632};
      assertEquals(ans2.length, sol.size());
      for (int i = 0; i < ans2.length; i++)
         assertEquals(true, sol.contains(ans2[i]));
   }
}