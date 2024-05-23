// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Lexer202410.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Lexer202410 {
  public static String currentString=null;
  static {
    int $line=0;
    $line=6;
    $try:try {
      currentString=$defaultValue(String.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static GArrayList images=null;
  static {
    int $line=0;
    $line=7;
    $try:try {
      images=$invokeConstructor(GArrayList.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet allSymbols=null;
  static {
    int $line=0;
    $line=9;
    $try:try {
      allSymbols=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet keyWords=null;
  static {
    int $line=0;
    $line=10;
    $try:try {
      keyWords=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet skipChars=null;
  static {
    int $line=0;
    $line=11;
    $try:try {
      skipChars=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet preKW=null;
  static {
    int $line=0;
    $line=13;
    $try:try {
      preKW=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet preOps=null;
  static {
    int $line=0;
    $line=14;
    $try:try {
      preOps=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet StartOps=null;
  static {
    int $line=0;
    $line=16;
    $try:try {
      StartOps=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet Symbols1=null;
  static {
    int $line=0;
    $line=17;
    $try:try {
      Symbols1=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet CharsSymbols1=null;
  static {
    int $line=0;
    $line=19;
    $try:try {
      CharsSymbols1=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet alphaUpper=null;
  static {
    int $line=0;
    $line=21;
    $try:try {
      alphaUpper=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet alphaLower=null;
  static {
    int $line=0;
    $line=22;
    $try:try {
      alphaLower=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet digits=null;
  static {
    int $line=0;
    $line=23;
    $try:try {
      digits=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet alphaNum=null;
  static {
    int $line=0;
    $line=25;
    $try:try {
      alphaNum=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet Out=null;
  static {
    int $line=0;
    $line=27;
    $try:try {
      Out=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static Boolean diffIdents=null;
  static {
    int $line=0;
    $line=28;
    $try:try {
      diffIdents=$defaultValue(Boolean.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static ISet Ids=null;
  static {
    int $line=0;
    $line=30;
    $try:try {
      Ids=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static GHashTableMap translation=null;
  static {
    int $line=0;
    $line=31;
    $try:try {
      translation=$invokeConstructor(GHashTableMap.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,null,$line);
    }
  }
  public static Object chars(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      int $v3=$int(0);
      int $v4=$int($invokeMethod("length",string,new Object[]{}))-1;
      $v2:for (int i=$v3; i<=$v4; i++) {
        $v1.add($invokeMethod("charAt",string,new Object[]{i}));
      }
      $result=$v1;
      if (true) break $try;
      $line=34;
      $rethrow(new RuntimeException("The function \"chars(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"chars",$line);
    }
    return $result;
  }
  public static Object charsStrings(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v5=$newSet(GCollections.emptySet());
      $v6:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v5.union(GCollections.unmodifiableSet(((java.lang.Iterable)(Lexer202410.chars(s)))));
      }
      $result=$v5;
      if (true) break $try;
      $line=36;
      $rethrow(new RuntimeException("The function \"charsStrings(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"charsStrings",$line);
    }
    return $result;
  }
  public static Object elements(Object array) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v7=$newSet();
      int $v9=$int(0);
      int $v10=$int($opAbsolY(array))-1;
      $v8:for (int i=$v9; i<=$v10; i++) {
        $v7.add($getArrayValue(array,new Object[]{i}));
      }
      $result=$v7;
      if (true) break $try;
      $line=38;
      $rethrow(new RuntimeException("The function \"elements(array:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"elements",$line);
    }
    return $result;
  }
  public static Object prefixes(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v11=$newSet();
      int $v13=$int(1);
      int $v14=$int($invokeMethod("length",string,new Object[]{}));
      $v12:for (int i=$v13; i<=$v14; i++) {
        $v11.add($invokeMethod("substring",string,new Object[]{0,i}));
      }
      $result=$v11;
      if (true) break $try;
      $line=40;
      $rethrow(new RuntimeException("The function \"prefixes(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"prefixes",$line);
    }
    return $result;
  }
  public static Object splits(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v15=$newSet();
      int $v17=$int(1);
      int $v18=$int($opSubtrY($invokeMethod("length",string,new Object[]{}),1));
      $v16:for (int i=$v17; i<=$v18; i++) {
        $v15.add(GCollections.asList($invokeMethod("substring",string,new Object[]{0,i}),$invokeMethod("substring",string,new Object[]{i,$invokeMethod("length",string,new Object[]{})})));
      }
      $result=$v15;
      if (true) break $try;
      $line=41;
      $rethrow(new RuntimeException("The function \"splits(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"splits",$line);
    }
    return $result;
  }
  public static Object allPrefixes(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v19=$newSet(GCollections.emptySet());
      $v20:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v19.union(GCollections.unmodifiableSet(((java.lang.Iterable)(Lexer202410.prefixes(s)))));
      }
      $result=$v19;
      if (true) break $try;
      $line=43;
      $rethrow(new RuntimeException("The function \"allPrefixes(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"allPrefixes",$line);
    }
    return $result;
  }
  public static Object translationGet(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result=(($bool((($opEqualY($opAbsolY(q),1)&&$opMembrY(q,Symbols1))&&!$opEqualY(q,'\n'))))?(q):(((gold.structures.map.GHashTableMap)translation).get(q)));
      if (true) break $try;
      $line=45;
      $rethrow(new RuntimeException("The function \"translationGet(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"translationGet",$line);
    }
    return $result;
  }
  public static Object runLexer(Object M, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=48;
      currentString=$cast(String.class,$fix(""));
      $line=49;
      images=$cast(GArrayList.class,$fix($invokeConstructor(GArrayList.class,new Object[]{})));
      $line=50;
      Object result=$fix($invokeMethod("acceptsString",M,new Object[]{input}));
      $line=51;
      $result=GCollections.asList(result,images);
      if (true) break $try;
      $line=52;
      $rethrow(new RuntimeException("The function \"runLexer(M:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"runLexer",$line);
    }
    return $result;
  }
  public static Object problems(String q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=56;
      if ($opMembrY(q,allSymbols)) {
        $line=56;
        $result=false;
        if (true) break $try;
      }
      else {
        $line=57;
        if ($opLessqY($opAbsolY(q),1)) {
          $line=57;
          $result=true;
          if (true) break $try;
        }
        else {
          $line=59;
          for (Object $v21:GCollections.unmodifiableCollection(Lexer202410.splits(q))) {
            java.util.Iterator $v22=GCollections.unmodifiableCollection($v21).iterator();
            Object s=$v22.next();
            Object t=$v22.next();
            $line=60;
            if ((!$bool(Lexer202410.problems($cast(java.lang.String.class,s)))&&!$bool(Lexer202410.problems($cast(java.lang.String.class,t))))) {
              $line=60;
              $result=false;
              if (true) break $try;
            }
          }
          $line=62;
          $result=true;
          if (true) break $try;
        }
      }
      $line=65;
      $rethrow(new RuntimeException("The function \"problems(q:String)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"problems",$line);
    }
    return $result;
  }
  public static Object translationPreOps(Object state) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=69;
      Object x=null;
      Object y=null;
      $line=70;
      String q=null;
      q=$defaultValue(String.class);
      $line=71;
      q=$cast(String.class,$fix(state));
      $line=72;
      Object n=$fix(((java.lang.String)q).length());
      $line=73;
      if ($opEqualY(n,0)) {
        $line=73;
        $result="";
        if (true) break $try;
      }
      else {
        $line=74;
        if ($opMembrY(q,allSymbols)) {
          $line=75;
          ((gold.structures.list.GArrayList)images).add(q);
          $line=76;
          $result=Lexer202410.translationGet(q);
          if (true) break $try;
        }
        else {
          $line=77;
          if ($opEqualY(n,1)) {
            $line=77;
            $result="";
            if (true) break $try;
          }
          else {
            $line=79;
            for (Object $v23:GCollections.unmodifiableCollection(Lexer202410.splits(q))) {
              java.util.Iterator $v24=GCollections.unmodifiableCollection($v23).iterator();
              Object s=$v24.next();
              Object t=$v24.next();
              $line=80;
              x=$fix(Lexer202410.translationPreOps(s));
              $line=81;
              y=$fix(Lexer202410.translationPreOps(t));
              $line=82;
              if ((!$opEqualY(x,"")&&!$opEqualY(y,""))) {
                $line=83;
                $result=$opAdditY(x,y);
                if (true) break $try;
              }
            }
            $line=86;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=90;
      $rethrow(new RuntimeException("The function \"translationPreOps(state:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"translationPreOps",$line);
    }
    return $result;
  }
  public static ITransducer createLexer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=94;
      Lexer202410.initialize();
      $line=96;
      preOps=$cast(ISet.class,$fix(Lexer202410.allPrefixes(allSymbols)));
      $line=97;
      preKW=$cast(ISet.class,$fix(Lexer202410.allPrefixes(keyWords)));
      $line=98;
      gold.structures.set.ISet $v25=$newSet(GCollections.emptySet());
      $v26:for (Object x:GCollections.unmodifiableCollection(allSymbols)) {
        $v25.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($invokeMethod("charAt",x,new Object[]{0}))))));
      }
      StartOps=$cast(ISet.class,$fix($v25));
      $line=99;
      gold.structures.set.ISet $v27=$newSet(GCollections.emptySet());
      $v28:for (Object x:GCollections.unmodifiableCollection(StartOps)) {
        $v27.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($opAdditY("",x))))));
      }
      Symbols1=$cast(ISet.class,$fix($opInterY($v27,allSymbols)));
      $line=100;
      gold.structures.set.ISet $v29=$newSet(GCollections.emptySet());
      $v30:for (Object x:GCollections.unmodifiableCollection(Symbols1)) {
        $v29.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($invokeMethod("charAt",x,new Object[]{0}))))));
      }
      CharsSymbols1=$cast(ISet.class,$fix($v29));
      $line=101;
      gold.structures.set.ISet $v31=$newSet(GCollections.emptySet());
      $v32:for (Object x:GCollections.unmodifiableCollection(((gold.structures.map.GHashTableMap)translation).values())) {
        $v31.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet(x)))));
      }
      Out=$cast(ISet.class,$fix($opUnionY(CharsSymbols1,$v31)));
      $line=103;
      System.out.println($message(new Object[]{Out}));
      $line=104;
      Ids=$cast(ISet.class,$fix(GCollections.asSet("IdU","IdL")));
      $line=106;
      Object Q=$fix($opUnionY($opUnionY(GCollections.asSet("INIT","IdU","Num","Err","IdL"),preKW),preOps));
      $line=108;
      System.out.println($message(new Object[]{Q}));
      $line=110;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY(alphaNum,Lexer202410.charsStrings(allSymbols)),skipChars),GCollections.asSet(':','-')));
      $line=113;
      Object q_0=$fix("INIT");
      $line=114;
      Object F=$fix(GCollections.asSet("INIT"));
      $line=115;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(Lexer202410.class,"\u03B4"),new GMethod(Lexer202410.class,"g"),new GMethod(Lexer202410.class,"h")});
      if (true) break $try;
      $line=116;
      $rethrow(new RuntimeException("The function \"createLexer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"createLexer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=121;
      String q=null;
      q=$defaultValue(String.class);
      $line=122;
      q=$cast(String.class,$fix(state));
      $line=124;
      if ($opEqualY(q,"Err")) {
        $line=124;
        $result="Err";
        if (true) break $try;
      }
      else {
        $line=125;
        if ($opMembrY(q,preOps)) {
          $line=126;
          if ($opMembrY($opAdditY(q,\u03C3),preOps)) {
            $line=126;
            $result=$opAdditY(q,\u03C3);
            if (true) break $try;
          }
          else {
            $line=127;
            if ($bool(Lexer202410.problems($cast(java.lang.String.class,q)))) {
              $line=127;
              $result="Err";
              if (true) break $try;
            }
            else {
              $line=128;
              if ($opMembrY(\u03C3,skipChars)) {
                $line=128;
                $result="INIT";
                if (true) break $try;
              }
              else {
                $line=129;
                if ($opMembrY(\u03C3,$opIntvlY('0','9'))) {
                  $line=129;
                  $result="Num";
                  if (true) break $try;
                }
                else {
                  $line=130;
                  if ($opMembrY($opAdditY("",\u03C3),preKW)) {
                    $line=130;
                    $result=$opAdditY("",\u03C3);
                    if (true) break $try;
                  }
                  else {
                    $line=131;
                    if ($opMembrY(\u03C3,alphaUpper)) {
                      $line=131;
                      $result="IdU";
                      if (true) break $try;
                    }
                    else {
                      $line=132;
                      if ($opMembrY(\u03C3,alphaLower)) {
                        $line=132;
                        $result="IdL";
                        if (true) break $try;
                      }
                      else {
                        $line=133;
                        if ($opMembrY($opAdditY("",\u03C3),preOps)) {
                          $line=133;
                          $result=$opAdditY("",\u03C3);
                          if (true) break $try;
                        }
                        else {
                          $line=134;
                          $result="Err";
                          if (true) break $try;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        else {
          $line=136;
          if (((($opMembrY(\u03C3,skipChars)&&$opMembrY(q,preKW))&&!$bool($opMembrY(q,keyWords)))&&$opEqualY(((java.lang.String)q).charAt($int(0)),':'))) {
            $line=136;
            $result="Err";
            if (true) break $try;
          }
          else {
            $line=137;
            if ($opMembrY(\u03C3,skipChars)) {
              $line=137;
              $result="INIT";
              if (true) break $try;
            }
            else {
              $line=138;
              if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                $line=138;
                $result="Num";
                if (true) break $try;
              }
              else {
                $line=139;
                if (($opEqualY(q,"INIT")&&$opMembrY($opAdditY("",\u03C3),preKW))) {
                  $line=139;
                  $result=$opAdditY("",\u03C3);
                  if (true) break $try;
                }
                else {
                  $line=140;
                  if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,alphaUpper))) {
                    $line=140;
                    $result="IdU";
                    if (true) break $try;
                  }
                  else {
                    $line=141;
                    if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,alphaLower))) {
                      $line=141;
                      $result="IdL";
                      if (true) break $try;
                    }
                    else {
                      $line=142;
                      if (($opEqualY(q,"INIT")&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                        $line=142;
                        $result=$opAdditY("",\u03C3);
                        if (true) break $try;
                      }
                      else {
                        $line=143;
                        if (($opMembrY(q,preKW)&&$opMembrY($opAdditY(q,\u03C3),preKW))) {
                          $line=143;
                          $result=$opAdditY(q,\u03C3);
                          if (true) break $try;
                        }
                        else {
                          $line=144;
                          if ((($opMembrY(q,preKW)&&$opMembrY(\u03C3,alphaNum))&&$opMembrY(((java.lang.String)q).charAt($int(0)),alphaUpper))) {
                            $line=144;
                            $result="IdU";
                            if (true) break $try;
                          }
                          else {
                            $line=145;
                            if ((($opMembrY(q,preKW)&&$opMembrY(\u03C3,alphaNum))&&$opMembrY(((java.lang.String)q).charAt($int(0)),alphaLower))) {
                              $line=145;
                              $result="IdL";
                              if (true) break $try;
                            }
                            else {
                              $line=146;
                              if (($opMembrY(q,preKW)&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                $line=146;
                                $result=$opAdditY("",\u03C3);
                                if (true) break $try;
                              }
                              else {
                                $line=147;
                                if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                                  $line=147;
                                  $result="Num";
                                  if (true) break $try;
                                }
                                else {
                                  $line=148;
                                  if (($opEqualY(q,"Num")&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                    $line=148;
                                    $result=$opAdditY("",\u03C3);
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=149;
                                    if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,alphaNum))) {
                                      $line=149;
                                      $result="Err";
                                      if (true) break $try;
                                    }
                                    else {
                                      $line=150;
                                      if (($opMembrY(q,Ids)&&$opMembrY(\u03C3,alphaNum))) {
                                        $line=150;
                                        $result=q;
                                        if (true) break $try;
                                      }
                                      else {
                                        $line=151;
                                        if (($opMembrY(q,Ids)&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                          $line=151;
                                          $result=$opAdditY("",\u03C3);
                                          if (true) break $try;
                                        }
                                        else {
                                          $line=152;
                                          $result="Err";
                                          if (true) break $try;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=154;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=160;
      $result="";
      if (true) break $try;
      $line=161;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"g",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=164;
      String s=null;
      s=$defaultValue(String.class);
      $line=165;
      s=$cast(String.class,$fix((($bool($opEqualY(\u03C3,'\n')))?("\\n"):($opAdditY("",\u03C3)))));
      $line=167;
      if ($opMembrY(q,preOps)) {
        $line=168;
        if (($opMembrY(\u03C3,skipChars)&&$opMembrY(q,allSymbols))) {
          $line=169;
          ((gold.structures.list.GArrayList)images).add(currentString);
          $line=170;
          currentString=$cast(String.class,$fix(""));
          $line=171;
          $result=Lexer202410.translationGet(q);
          if (true) break $try;
        }
        else {
          $line=172;
          if ($opMembrY($opAdditY(q,\u03C3),preOps)) {
            $line=173;
            currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
            $line=174;
            $result="";
            if (true) break $try;
          }
          else {
            $line=175;
            if (($opMembrY(\u03C3,$opUnionY(StartOps,alphaNum))&&$opMembrY(q,allSymbols))) {
              $line=176;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=177;
              currentString=$cast(String.class,$fix($opAdditY("",s)));
              $line=178;
              $result=Lexer202410.translationGet(q);
              if (true) break $try;
            }
            else {
              $line=179;
              if ($opMembrY(\u03C3,$opUnionY($opUnionY($opUnionY(StartOps,alphaNum),skipChars),GCollections.asSet(':')))) {
                $line=180;
                currentString=$cast(String.class,$fix($opAdditY("",s)));
                $line=181;
                $result=Lexer202410.translationPreOps(q);
                if (true) break $try;
              }
              else {
                $line=183;
                currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
                $line=184;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      else {
        $line=188;
        if ((!$opMembrY(q,GCollections.asSet("Err"))&&$opMembrY(\u03C3,$opUnionY(skipChars,StartOps)))) {
          $line=189;
          if ($opEqualY(q,"INIT")) {
            $line=190;
            currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,StartOps)))?(s):(""))));
            $line=191;
            $result="";
            if (true) break $try;
          }
          else {
            $line=192;
            if ($opEqualY(Lexer202410.translationGet(q),null)) {
              $line=194;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=195;
              currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,$opUnionY(skipChars,StartOps))))?(s):(""))));
              $line=196;
              Object f=$fix($invokeMethod("charAt",q,new Object[]{0}));
              $line=197;
              if ($opMembrY(f,alphaUpper)) {
                $line=197;
                $result=Lexer202410.translationGet("IdU");
                if (true) break $try;
              }
              else {
                $line=198;
                if ($opMembrY(f,alphaLower)) {
                  $line=199;
                  $result=Lexer202410.translationGet("IdL");
                  if (true) break $try;
                }
                else {
                  $line=200;
                  $result=null;
                  if (true) break $try;
                }
              }
            }
            else {
              $line=203;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=204;
              currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,$opUnionY(skipChars,StartOps))))?(s):(""))));
              $line=205;
              $result=Lexer202410.translationGet(q);
              if (true) break $try;
            }
          }
        }
        else {
          $line=208;
          currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
          $line=209;
          $result="";
          if (true) break $try;
        }
      }
      $line=212;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"h",$line);
    }
    return $result;
  }
  public static Object initialize() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=218;
      skipChars=$cast(ISet.class,$fix(GCollections.asSet(' ','\t','\n')));
      $line=219;
      alphaUpper=$cast(ISet.class,$fix($opIntvlY('A','Z')));
      $line=220;
      alphaLower=$cast(ISet.class,$fix($opIntvlY('a','z')));
      $line=221;
      digits=$cast(ISet.class,$fix($opIntvlY('0','9')));
      $line=222;
      alphaNum=$cast(ISet.class,$fix($opUnionY($opUnionY($opUnionY(alphaUpper,alphaLower),digits),GCollections.asSet('-','?','%','.','/','*'))));
      $line=224;
      keyWords=$cast(ISet.class,$fix(GCollections.asSet("move","skip","turn","face","put","pick","name","run-dirs","move-dir","move-face","null","Dim","myXpos","myYpos","myChips","myBalloons","balloonsHere","ChipsHere","Spaces","if","loop","repeat","facing?","blocked?","can-put?","can-pick?","can-move?","isZero","not","move-dir",":front",":right",":left",":back",":north",":south",":west",":east",":around",":balloons",":chips","defvar","defun","chips","balloons","isZero?","north","south","east","west")));
      $line=228;
      allSymbols=$cast(ISet.class,$fix(GCollections.asSet("(",")","=")));
      $line=240;
      ((gold.structures.map.GHashTableMap)translation).put("defvar",'V');
      $line=241;
      ((gold.structures.map.GHashTableMap)translation).put("defun",'D');
      $line=244;
      ((gold.structures.map.GHashTableMap)translation).put("move",'m');
      $line=245;
      ((gold.structures.map.GHashTableMap)translation).put("skip",'s');
      $line=246;
      ((gold.structures.map.GHashTableMap)translation).put("turn",'t');
      $line=247;
      ((gold.structures.map.GHashTableMap)translation).put("face",'f');
      $line=248;
      ((gold.structures.map.GHashTableMap)translation).put("put",'p');
      $line=249;
      ((gold.structures.map.GHashTableMap)translation).put("pick",'k');
      $line=250;
      ((gold.structures.map.GHashTableMap)translation).put("name",'n');
      $line=251;
      ((gold.structures.map.GHashTableMap)translation).put("run-dirs",'I');
      $line=252;
      ((gold.structures.map.GHashTableMap)translation).put("move-dir",'M');
      $line=253;
      ((gold.structures.map.GHashTableMap)translation).put("move-face",'G');
      $line=254;
      ((gold.structures.map.GHashTableMap)translation).put("null",'!');
      $line=257;
      ((gold.structures.map.GHashTableMap)translation).put("Dim",'d');
      $line=258;
      ((gold.structures.map.GHashTableMap)translation).put("myXpos",'X');
      $line=259;
      ((gold.structures.map.GHashTableMap)translation).put("myYpos",'Y');
      $line=260;
      ((gold.structures.map.GHashTableMap)translation).put("myChips",'C');
      $line=261;
      ((gold.structures.map.GHashTableMap)translation).put("myBalloons",'Z');
      $line=262;
      ((gold.structures.map.GHashTableMap)translation).put("balloonsHere",'b');
      $line=263;
      ((gold.structures.map.GHashTableMap)translation).put("ChipsHere",'c');
      $line=264;
      ((gold.structures.map.GHashTableMap)translation).put("Spaces",'S');
      $line=267;
      ((gold.structures.map.GHashTableMap)translation).put("balloons",'j');
      $line=268;
      ((gold.structures.map.GHashTableMap)translation).put("chips",'q');
      $line=271;
      ((gold.structures.map.GHashTableMap)translation).put("north",'%');
      $line=272;
      ((gold.structures.map.GHashTableMap)translation).put("south",'.');
      $line=273;
      ((gold.structures.map.GHashTableMap)translation).put("east",'/');
      $line=274;
      ((gold.structures.map.GHashTableMap)translation).put("west",'*');
      $line=277;
      ((gold.structures.map.GHashTableMap)translation).put(":front",'F');
      $line=278;
      ((gold.structures.map.GHashTableMap)translation).put(":right",'R');
      $line=279;
      ((gold.structures.map.GHashTableMap)translation).put(":left",'L');
      $line=280;
      ((gold.structures.map.GHashTableMap)translation).put(":back",'B');
      $line=281;
      ((gold.structures.map.GHashTableMap)translation).put(":north",'N');
      $line=282;
      ((gold.structures.map.GHashTableMap)translation).put(":south",'H');
      $line=283;
      ((gold.structures.map.GHashTableMap)translation).put(":west",'W');
      $line=284;
      ((gold.structures.map.GHashTableMap)translation).put(":east",'E');
      $line=285;
      ((gold.structures.map.GHashTableMap)translation).put(":around",'A');
      $line=286;
      ((gold.structures.map.GHashTableMap)translation).put(":balloons",'J');
      $line=287;
      ((gold.structures.map.GHashTableMap)translation).put(":chips",'Q');
      $line=290;
      ((gold.structures.map.GHashTableMap)translation).put("if",'i');
      $line=291;
      ((gold.structures.map.GHashTableMap)translation).put("loop",'l');
      $line=292;
      ((gold.structures.map.GHashTableMap)translation).put("repeat",'r');
      $line=295;
      ((gold.structures.map.GHashTableMap)translation).put("facing?",'g');
      $line=296;
      ((gold.structures.map.GHashTableMap)translation).put("blocked?",'o');
      $line=297;
      ((gold.structures.map.GHashTableMap)translation).put("can-put?",'a');
      $line=298;
      ((gold.structures.map.GHashTableMap)translation).put("can-pick?",'K');
      $line=299;
      ((gold.structures.map.GHashTableMap)translation).put("can-move?",'O');
      $line=300;
      ((gold.structures.map.GHashTableMap)translation).put("not",'z');
      $line=301;
      ((gold.structures.map.GHashTableMap)translation).put("isZero?",'e');
      $line=305;
      ((gold.structures.map.GHashTableMap)translation).put("IdL",'v');
      $line=306;
      ((gold.structures.map.GHashTableMap)translation).put("IdU",'v');
      $line=309;
      ((gold.structures.map.GHashTableMap)translation).put("Num",'#');
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202410.class,"initialize",$line);
    }
    return $result;
  }
}
