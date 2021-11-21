package com.javacodegeeks.snippets.core;
 
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
 
class MainBob {
 
    public static void main(String[] argv) throws Exception {
 
  String algo = "DH"; //Change this to RSA, DSA ...
 
 
  // Generate a 1024-bit Digital Signature Algorithm
 
  KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance(algo);
 
  keyGenerator.initialize(1024);
 
  KeyPair kpair = keyGenerator.genKeyPair();
 
  PrivateKey priKey = kpair.getPrivate();
 
  PublicKey pubKey = kpair.getPublic();
 
  String frm = priKey.getFormat();
 
  System.out.println("Private key format :" + frm);
 
  System.out.println("Diffie-Helman Private key parameters are:" + priKey);
 
  frm = pubKey.getFormat();
 
  System.out.println("Public key format :" + frm);
 
  System.out.println("Diffie-Helman Publsic key parameters are:" + pubKey);
 
  //System.out.println("-----------------------------------\n Public Key"+pubKey);
    }
}
