

/* First created by JCasGen Tue Sep 24 19:27:48 CDT 2013 */
package org.ohnlp.typesystem.type.syntax;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A verb phrase
Equivalent to Mayo cTAKES version 2.5: edu.mayo.bmi.uima.chunker.type.VP
 * Updated by JCasGen Wed Oct 30 16:30:49 CDT 2013
 * XML source: /home/liu/edtnlp/MedTagger-1.0/descsrc/org/ohnlp/medtagger/types/MedTaggerTypes.xml
 * @generated */
public class VP extends Chunk {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(VP.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected VP() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public VP(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public VP(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public VP(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    