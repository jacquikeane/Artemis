/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:29:27 GMT 2018
 */

package uk.ac.sanger.artemis.chado;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.cv.CvTerm;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryChangeEvent;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.chado.ChadoTransactionManager;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.sequence.SequenceChangeEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChadoTransactionManager_ESTest extends ChadoTransactionManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChadoTransactionManager.isCvTag((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChadoTransactionManager.isSynonymTag(" is not a valid qualifier!", (GFFStreamFeature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      boolean boolean0 = chadoTransactionManager0.hasTransactions();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      Vector<String> vector0 = chadoTransactionManager0.getFeatureInsertUpdate();
      assertNull(vector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CvTerm cvTerm0 = ChadoTransactionManager.getCvTerm("BLabrAP]:z6Fph?k", "GKEhcB!SPM9", "", "BLabrAP]:z6Fph?k");
      assertEquals("BLabrAP]:z6Fph?k", cvTerm0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CvTerm cvTerm0 = ChadoTransactionManager.getCvTerm("", "CCGEN", "BVpn>b+'vY", "2o{S0fD~hO");
      assertEquals("BVpn>b+'vY", cvTerm0.getDefinition());
      assertEquals("", cvTerm0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CvTerm cvTerm0 = ChadoTransactionManager.getCvTerm("  in handleReservedTags() DELETE db=", "8sl-\"QI<:l3", (String) null, (String) null);
      assertEquals("  in handleReservedTags() DELETE db=", cvTerm0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = ChadoTransactionManager.isCvTag("COMMIT DONE ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChadoTransactionManager.isSpecialTag("}~!EME\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      EntryChangeEvent entryChangeEvent0 = new EntryChangeEvent(chadoTransactionManager0, (Entry) null, 0);
      chadoTransactionManager0.entryChanged(entryChangeEvent0);
      assertEquals(1, EntryChangeEvent.FEATURE_DELETED);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      Range range0 = new Range(899);
      SequenceChangeEvent sequenceChangeEvent0 = new SequenceChangeEvent(899, 58, range0);
      chadoTransactionManager0.sequenceChanged(sequenceChangeEvent0);
      assertEquals(4, SequenceChangeEvent.CONTIG_REVERSE_COMPLEMENT);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      Range range0 = new Range((-639));
      SequenceChangeEvent sequenceChangeEvent0 = new SequenceChangeEvent((byte)1, (byte)9, range0);
      // Undeclared exception!
      try { 
        chadoTransactionManager0.sequenceChanged(sequenceChangeEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.ChadoTransactionManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      int int0 = chadoTransactionManager0.getCommitReturnValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      // Undeclared exception!
      try { 
        chadoTransactionManager0.getTransactionAt((-142));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = ChadoTransactionManager.getSynonymTags();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      int int0 = chadoTransactionManager0.getTransactionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChadoTransactionManager chadoTransactionManager0 = new ChadoTransactionManager();
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      chadoTransactionManager0.setEntryGroup(simpleEntryGroup0);
      assertEquals(0, simpleEntryGroup0.size());
  }
}