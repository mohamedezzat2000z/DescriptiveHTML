/* Generated By:JavaCC: Do not edit this line. Generate.java */
package generate;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.StringReader;

public class Generate implements GenerateConstants {

    public static void main(String[] args) throws Exception {
      String input=null;
      Reader reader = new StringReader(input);
      Generate generator=new Generate(reader);
      generator.create();
        }

  final public String create() throws ParseException {
 StringBuilder sb = new StringBuilder();
    jj_consume_token(16);
    element(sb);
    jj_consume_token(11);
                                  {if (true) return sb.toString();}
    throw new Error("Missing return statement in function");
  }

  final public void element(StringBuilder sb) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 13:
      img(sb);
      break;
    case 17:
      header(sb);
      break;
    case 12:
      para(sb);
      break;
    case 18:
      url(sb);
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void img(StringBuilder sb) throws ParseException {
                             StringBuilder sb1 = new StringBuilder();
    jj_consume_token(13);
    jj_consume_token(14);
    jj_consume_token(15);
    jj_consume_token(9);
    sentence(sb1);
    sb.append("<img src=");
                   sb.append('"' );
                   sb.append(sb1.toString());
                   sb.append('"');
                   sb.append(" />");
    jj_consume_token(9);
  }

  final public void header(StringBuilder sb) throws ParseException {
    jj_consume_token(17);
              sb.append("<h1");
    decorated_text(sb);
                                                     sb.append("</h1>");
  }

  final public void para(StringBuilder sb) throws ParseException {
    jj_consume_token(12);
               sb.append("<p");
    decorated_text(sb);
                                                      sb.append("</p>");
  }

  final public void url(StringBuilder sb) throws ParseException {
    jj_consume_token(18);
          sb.append("<a ");
    decorated_url(sb);
                                                sb.append("</a>" );
  }

  final public void sentence(StringBuilder sb) throws ParseException {

    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 3:
      case 4:
      case 6:
      case 7:
      case 8:
      case word:
      case NUM:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      apha(sb);
    }
  }

  final public void apha(StringBuilder sb) throws ParseException {
                               Token y;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 3:
      y = jj_consume_token(3);
                sb.append(y.toString());
      break;
    case 4:
      y = jj_consume_token(4);
                 sb.append(y.toString());
      break;
    case 6:
      y = jj_consume_token(6);
                sb.append(y.toString());
      break;
    case 7:
      y = jj_consume_token(7);
                sb.append(y.toString());
      break;
    case NUM:
      y = jj_consume_token(NUM);
                   sb.append(y.toString());
      break;
    case word:
      y = jj_consume_token(word);
                    sb.append(y.toString());
      break;
    case 8:
      y = jj_consume_token(8);
                  sb.append(y.toString());
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void decorated_text(StringBuilder sb) throws ParseException {
    decorated_textDash(sb);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 22:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      jj_consume_token(22);
      decorated_textDash(sb);
    }
  }

  final public void decorated_textDash(StringBuilder sb) throws ParseException {
    jj_consume_token(14);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 19:
      text(sb);
      break;
    case 20:
      color(sb);
      break;
    case 21:
      font(sb);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void text(StringBuilder sb) throws ParseException {
    jj_consume_token(19);
           sb.append(">");
    jj_consume_token(9);
    sentence(sb);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 10:
      jj_consume_token(10);
      break;
    case 9:
      jj_consume_token(9);
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void color(StringBuilder sb) throws ParseException {
 StringBuilder sb1 = new StringBuilder();
    jj_consume_token(20);
    jj_consume_token(9);
    sentence(sb1);
    if(sb.indexOf("style="+'"',0) == -1) {

                sb.insert(sb.indexOf(">"), "style="+'"'+'"');
    }

    sb.insert(sb.indexOf("style="+'"')+7,"color:"+sb1.toString()+";");
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 10:
      jj_consume_token(10);
      break;
    case 9:
      jj_consume_token(9);
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void font(StringBuilder sb) throws ParseException {
                             StringBuilder sb1 = new StringBuilder();
    jj_consume_token(21);
    jj_consume_token(9);
    sentence(sb1);
        if(sb.indexOf("style="+'"',0) == -1) {

                sb.insert(sb.indexOf(">"), "style="+'"'+'"');
        }

        sb.insert(sb.indexOf("style="+'"')+7,"font-family:"+sb1.toString()+";");
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 10:
      jj_consume_token(10);
      break;
    case 9:
      jj_consume_token(9);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void decorated_url(StringBuilder sb) throws ParseException {
                                      StringBuilder sb1 = new StringBuilder();
    jj_consume_token(14);
    jj_consume_token(19);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 10:
      jj_consume_token(10);
      break;
    case 9:
      jj_consume_token(9);
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
                        sb.append(">");
    sentence(sb);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 10:
      jj_consume_token(10);
      break;
    case 9:
      jj_consume_token(9);
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(22);
    jj_consume_token(23);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 10:
      jj_consume_token(10);
      break;
    case 9:
      jj_consume_token(9);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    sentence(sb1);
        if(sb.indexOf("src="+'"',0) == -1) {

                sb.insert(sb.indexOf(">"), "src="+'"'+'"');
        }

        sb.insert(sb.indexOf("="+'"')+2,sb1.toString());
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 10:
      jj_consume_token(10);
      break;
    case 9:
      jj_consume_token(9);
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_3;
      }
      decorated_text(sb);
    }
  }

  /** Generated Token Manager. */
  public GenerateTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[13];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x63000,0x30001d8,0x30001d8,0x400000,0x380000,0x600,0x600,0x600,0x600,0x600,0x600,0x600,0x4000,};
   }

  /** Constructor with InputStream. */
  public Generate(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Generate(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new GenerateTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Generate(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new GenerateTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Generate(GenerateTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(GenerateTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 13; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[26];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 13; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 26; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}