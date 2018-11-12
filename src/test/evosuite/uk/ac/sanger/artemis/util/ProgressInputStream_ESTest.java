/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 20:20:20 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;
import uk.ac.sanger.artemis.util.InputStreamProgressListenerVector;
import uk.ac.sanger.artemis.util.ProgressInputStream;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProgressInputStream_ESTest extends ProgressInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream((InputStream) null, inputStreamProgressListenerVector0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        progressInputStream0.read(byteArray0, 67, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(dataInputStream0, inputStreamProgressListenerVector0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        progressInputStream0.read(byteArray0, 2282, (int) (byte)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = MockFile.createTempFile("P%6+FC'A", (String) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(mockFileInputStream0, inputStreamProgressListenerVector0);
      byte[] byteArray0 = new byte[0];
      progressInputStream0.close();
      try { 
        progressInputStream0.read(byteArray0, 0, 3);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<InputStream> stack0 = new Stack<InputStream>();
      Enumeration<InputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(sequenceInputStream0, sequenceInputStream0);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(sequenceInputStream1, inputStreamProgressListenerVector0);
      byte[] byteArray0 = new byte[6];
      stack0.add((InputStream) sequenceInputStream0);
      // Undeclared exception!
      try { 
        progressInputStream0.read(byteArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-87), 36);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(byteArrayInputStream0, inputStreamProgressListenerVector0);
      // Undeclared exception!
      try { 
        progressInputStream0.read(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(mockFileInputStream0, inputStreamProgressListenerVector0);
      byte[] byteArray0 = new byte[5];
      try { 
        progressInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 36);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(byteArrayInputStream0, inputStreamProgressListenerVector0);
      int int0 = progressInputStream0.read(byteArray0, (int) (byte)1, (int) (byte)1);
      assertEquals(22, byteArrayInputStream0.available());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stack<InputStream> stack0 = new Stack<InputStream>();
      Enumeration<InputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(sequenceInputStream0, inputStreamProgressListenerVector0);
      byte[] byteArray0 = new byte[6];
      int int0 = progressInputStream0.read(byteArray0, (int) (byte)0, 1583);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      ProgressInputStream progressInputStream0 = new ProgressInputStream(pushbackInputStream0, (InputStreamProgressListenerVector) null);
      progressInputStream0.close();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Stack<InputStream> stack0 = new Stack<InputStream>();
      Enumeration<InputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(sequenceInputStream0, inputStreamProgressListenerVector0);
      byte[] byteArray0 = new byte[6];
      int int0 = progressInputStream0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 36);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(byteArrayInputStream0, inputStreamProgressListenerVector0);
      progressInputStream0.read(byteArray0);
      inputStreamProgressListenerVector0.add((InputStreamProgressListener) null);
      // Undeclared exception!
      try { 
        progressInputStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.ProgressInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = MockFile.createTempFile("P%6+FC'A", "P%6+FC'A");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = new byte[0];
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(mockFileInputStream0, inputStreamProgressListenerVector0);
      int int0 = progressInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream((InputStream) null, inputStreamProgressListenerVector0);
      // Undeclared exception!
      try { 
        progressInputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      ProgressInputStream progressInputStream0 = new ProgressInputStream(mockFileInputStream0, inputStreamProgressListenerVector0);
      byte[] byteArray0 = new byte[6];
      int int0 = progressInputStream0.read(byteArray0, (int) (byte)0, 0);
      assertEquals(0, int0);
  }
}