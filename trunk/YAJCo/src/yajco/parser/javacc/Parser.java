/* Generated By:JavaCC: Do not edit this line. Parser.java */
package yajco.parser.javacc;

public class Parser implements ParserConstants {

  static final public yajco.model.Language parse() throws ParseException {
  yajco.model.Language _value;
    _value = LanguageSymbol();
    jj_consume_token(0);
   {if (true) return _value;}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.impl.printer.NewLine NewLineSymbol() throws ParseException {
    jj_consume_token(NEWLINE);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.printer.NewLine( ));}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.type.ArrayType ArrayTypeSymbol() throws ParseException {
  yajco.model.type.Type componentType_1 = null;
    jj_consume_token(ARRAY);
    jj_consume_token(OF);
    componentType_1 = TypeSymbol();

    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.type.ArrayType( componentType_1), (Object)componentType_1);}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.PropertyReferencePart PropertyReferencePartSymbol() throws ParseException {
  java.lang.String name_1 = null;
  Token _tokenname_1 = null;
  yajco.model.pattern.NotationPartPattern[] patterns_1 = null;
  java.util.List<yajco.model.pattern.NotationPartPattern> _listpatterns_1 = new java.util.ArrayList<yajco.model.pattern.NotationPartPattern>();
  yajco.model.pattern.NotationPartPattern _itempatterns_1 = null;
    _tokenname_1 = jj_consume_token(NAME);
                                   name_1 = _tokenname_1.image;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case _123:
      jj_consume_token(_123);
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case SEPARATOR:
        case REFERENCES:
        case RANGE:
        case INDENT:
        case NEWLINE:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        _itempatterns_1 = NotationPartPatternSymbol();
                                                              _listpatterns_1.add(_itempatterns_1);
      }
    patterns_1 = _listpatterns_1.toArray(new yajco.model.pattern.NotationPartPattern[] {});
      jj_consume_token(_125);
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.PropertyReferencePart( name_1, patterns_1), (Object)name_1, patterns_1);}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.impl.Range RangeSymbol() throws ParseException {
  int minOccurs_1 = 0;
  Token _tokenminOccurs_1 = null;
  int minOccurs_2 = 0;
  Token _tokenminOccurs_2 = null;
  int maxOccurs_2 = 0;
  Token _tokenmaxOccurs_2 = null;
    if (jj_2_1(5)) {
      jj_consume_token(RANGE);
      jj_consume_token(_40);
      _tokenminOccurs_1 = jj_consume_token(INT_VALUE);
                                           minOccurs_1 = Integer.parseInt(_tokenminOccurs_1.image);
      jj_consume_token(_46_46);
      jj_consume_token(_42);
      jj_consume_token(_41);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.Range( minOccurs_1), (Object)minOccurs_1);}
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case RANGE:
        jj_consume_token(RANGE);
        jj_consume_token(_40);
        _tokenminOccurs_2 = jj_consume_token(INT_VALUE);
                                           minOccurs_2 = Integer.parseInt(_tokenminOccurs_2.image);
        jj_consume_token(_46_46);
        _tokenmaxOccurs_2 = jj_consume_token(INT_VALUE);
                                          maxOccurs_2 = Integer.parseInt(_tokenmaxOccurs_2.image);
        jj_consume_token(_41);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.Range( minOccurs_2, maxOccurs_2), (Object)minOccurs_2, maxOccurs_2);}
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.impl.Parentheses ParenthesesSymbol() throws ParseException {
  java.lang.String left_2 = null;
  Token _tokenleft_2 = null;
  java.lang.String right_2 = null;
  Token _tokenright_2 = null;
    if (jj_2_2(2)) {
      jj_consume_token(PARENTHESES);
      jj_consume_token(_40);
      _tokenleft_2 = jj_consume_token(LEFT);
                                 left_2 = _tokenleft_2.image;
      jj_consume_token(_44);
      _tokenright_2 = jj_consume_token(RIGHT);
                                  right_2 = _tokenright_2.image;
      jj_consume_token(_41);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.Parentheses( left_2, right_2), (Object)left_2, right_2);}
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PARENTHESES:
        jj_consume_token(PARENTHESES);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.Parentheses( ));}
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.type.ReferenceType ReferenceTypeSymbol() throws ParseException {
  java.lang.String name_1 = null;
  Token _tokenname_1 = null;
    _tokenname_1 = jj_consume_token(NAME);
                                   name_1 = _tokenname_1.image;
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.type.ReferenceType( name_1), (Object)name_1);}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.type.Type TypeSymbol() throws ParseException {
  yajco.model.type.Type _value = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BOOLEAN:
    case INTEGER:
    case REAL:
    case STRING:
      _value = PrimitiveTypeSymbol();
      break;
    case NAME:
      _value = ReferenceTypeSymbol();
      break;
    case ARRAY:
      _value = ArrayTypeSymbol();
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return _value;}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.impl.Operator OperatorSymbol() throws ParseException {
  int intValue_1 = 0;
  Token _tokenintValue_1 = null;
  int intValue_2 = 0;
  Token _tokenintValue_2 = null;
  tuke.pargen.annotation.Associativity associativity_2 = null;
    if (jj_2_3(6)) {
      jj_consume_token(OPERATOR);
      jj_consume_token(_40);
      jj_consume_token(PRIORITY);
      jj_consume_token(_61);
      _tokenintValue_2 = jj_consume_token(INT_VALUE);
                                         intValue_2 = Integer.parseInt(_tokenintValue_2.image);
      jj_consume_token(ASSOCIATIVITY);
      jj_consume_token(_61);
      associativity_2 = AssociativitySymbol();

      jj_consume_token(_41);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.Operator( intValue_2, associativity_2), (Object)intValue_2, associativity_2);}
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERATOR:
        jj_consume_token(OPERATOR);
        jj_consume_token(_40);
        jj_consume_token(PRIORITY);
        jj_consume_token(_61);
        _tokenintValue_1 = jj_consume_token(INT_VALUE);
                                         intValue_1 = Integer.parseInt(_tokenintValue_1.image);
        jj_consume_token(_41);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.Operator( intValue_1), (Object)intValue_1);}
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.LocalVariablePart LocalVariablePartSymbol() throws ParseException {
  java.lang.String name_1 = null;
  Token _tokenname_1 = null;
  yajco.model.type.Type type_1 = null;
  yajco.model.pattern.NotationPartPattern[] patterns_1 = null;
  java.util.List<yajco.model.pattern.NotationPartPattern> _listpatterns_1 = new java.util.ArrayList<yajco.model.pattern.NotationPartPattern>();
  yajco.model.pattern.NotationPartPattern _itempatterns_1 = null;
    _tokenname_1 = jj_consume_token(NAME);
                                   name_1 = _tokenname_1.image;
    jj_consume_token(_58);
    type_1 = TypeSymbol();

    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case _123:
      jj_consume_token(_123);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case SEPARATOR:
        case REFERENCES:
        case RANGE:
        case INDENT:
        case NEWLINE:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_2;
        }
        _itempatterns_1 = NotationPartPatternSymbol();
                                                              _listpatterns_1.add(_itempatterns_1);
      }
    patterns_1 = _listpatterns_1.toArray(new yajco.model.pattern.NotationPartPattern[] {});
      jj_consume_token(_125);
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.LocalVariablePart( name_1, type_1, patterns_1), (Object)name_1, type_1, patterns_1);}
    throw new Error("Missing return statement in function");
  }

  static final public tuke.pargen.annotation.Associativity AssociativitySymbol() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LEFT:
      jj_consume_token(LEFT);
              {if (true) return tuke.pargen.annotation.Associativity.LEFT;}
      break;
    case RIGHT:
      jj_consume_token(RIGHT);
              {if (true) return tuke.pargen.annotation.Associativity.RIGHT;}
      break;
    case NONE:
      jj_consume_token(NONE);
             {if (true) return tuke.pargen.annotation.Associativity.NONE;}
      break;
    case AUTO:
      jj_consume_token(AUTO);
             {if (true) return tuke.pargen.annotation.Associativity.AUTO;}
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.PropertyPattern PropertyPatternSymbol() throws ParseException {
  yajco.model.pattern.PropertyPattern _value = null;
    _value = IdentifierSymbol();
    {if (true) return _value;}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.Concept ConceptSymbol() throws ParseException {
  java.lang.String name_1 = null;
  Token _tokenname_1 = null;
  java.lang.String parent_1 = null;
  Token _tokenparent_1 = null;
  yajco.model.pattern.ConceptPattern[] patterns_1 = null;
  java.util.List<yajco.model.pattern.ConceptPattern> _listpatterns_1 = new java.util.ArrayList<yajco.model.pattern.ConceptPattern>();
  yajco.model.pattern.ConceptPattern _itempatterns_1 = null;
  yajco.model.Property[] abstractSyntax_1 = null;
  java.util.List<yajco.model.Property> _listabstractSyntax_1 = new java.util.ArrayList<yajco.model.Property>();
  yajco.model.Property _itemabstractSyntax_1 = null;
  yajco.model.Notation[] concreteSyntax_1 = null;
  java.util.List<yajco.model.Notation> _listconcreteSyntax_1 = new java.util.ArrayList<yajco.model.Notation>();
  yajco.model.Notation _itemconcreteSyntax_1 = null;
    jj_consume_token(CONCEPT);
    _tokenname_1 = jj_consume_token(NAME);
                                name_1 = _tokenname_1.image;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case _58:
      jj_consume_token(_58);
      _tokenparent_1 = jj_consume_token(NAME);
                                    parent_1 = _tokenparent_1.image;
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case _123:
      jj_consume_token(_123);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OPERATOR:
        case PARENTHESES:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_3;
        }
        _itempatterns_1 = ConceptPatternSymbol();
                                                         _listpatterns_1.add(_itempatterns_1);
      }
    patterns_1 = _listpatterns_1.toArray(new yajco.model.pattern.ConceptPattern[] {});
      jj_consume_token(_125);
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AS:
      jj_consume_token(AS);
      jj_consume_token(_58);
      _itemabstractSyntax_1 = PropertySymbol();
                                                        _listabstractSyntax_1.add(_itemabstractSyntax_1);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case _44:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_4;
        }
        jj_consume_token(_44);
        _itemabstractSyntax_1 = PropertySymbol();
                                                           _listabstractSyntax_1.add(_itemabstractSyntax_1);
      }
    abstractSyntax_1 = _listabstractSyntax_1.toArray(new yajco.model.Property[] {});
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CS:
      jj_consume_token(CS);
      jj_consume_token(_58);
      _itemconcreteSyntax_1 = NotationSymbol();
                                                        _listconcreteSyntax_1.add(_itemconcreteSyntax_1);
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case _124:
          ;
          break;
        default:
          jj_la1[14] = jj_gen;
          break label_5;
        }
        jj_consume_token(_124);
        _itemconcreteSyntax_1 = NotationSymbol();
                                                           _listconcreteSyntax_1.add(_itemconcreteSyntax_1);
      }
    concreteSyntax_1 = _listconcreteSyntax_1.toArray(new yajco.model.Notation[] {});
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.Concept( name_1, parent_1, patterns_1, abstractSyntax_1, concreteSyntax_1), (Object)name_1, parent_1, patterns_1, abstractSyntax_1, concreteSyntax_1);}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.Property PropertySymbol() throws ParseException {
  java.lang.String name_1 = null;
  Token _tokenname_1 = null;
  yajco.model.type.Type type_1 = null;
  yajco.model.pattern.PropertyPattern[] patterns_1 = null;
  java.util.List<yajco.model.pattern.PropertyPattern> _listpatterns_1 = new java.util.ArrayList<yajco.model.pattern.PropertyPattern>();
  yajco.model.pattern.PropertyPattern _itempatterns_1 = null;
    _tokenname_1 = jj_consume_token(NAME);
                                   name_1 = _tokenname_1.image;
    jj_consume_token(_58);
    type_1 = TypeSymbol();

    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case _123:
      jj_consume_token(_123);
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[16] = jj_gen;
          break label_6;
        }
        _itempatterns_1 = PropertyPatternSymbol();
                                                          _listpatterns_1.add(_itempatterns_1);
      }
    patterns_1 = _listpatterns_1.toArray(new yajco.model.pattern.PropertyPattern[] {});
      jj_consume_token(_125);
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.Property( name_1, type_1, patterns_1), (Object)name_1, type_1, patterns_1);}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.Notation NotationSymbol() throws ParseException {
  yajco.model.NotationPart[] parts_1 = null;
  java.util.List<yajco.model.NotationPart> _listparts_1 = new java.util.ArrayList<yajco.model.NotationPart>();
  yajco.model.NotationPart _itemparts_1 = null;
    _itemparts_1 = NotationPartSymbol();
                                                    _listparts_1.add(_itemparts_1);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NAME:
      case STRING_VALUE:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_7;
      }
      _itemparts_1 = NotationPartSymbol();
                                                  _listparts_1.add(_itemparts_1);
    }
    parts_1 = _listparts_1.toArray(new yajco.model.NotationPart[] {});
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.Notation( parts_1), (Object)parts_1);}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.ConceptPattern ConceptPatternSymbol() throws ParseException {
  yajco.model.pattern.ConceptPattern _value = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OPERATOR:
      _value = OperatorSymbol();
      break;
    case PARENTHESES:
      _value = ParenthesesSymbol();
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return _value;}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.type.PrimitiveType PrimitiveTypeSymbol() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BOOLEAN:
      jj_consume_token(BOOLEAN);
                 {if (true) return yajco.model.type.PrimitiveType.BOOLEAN;}
      break;
    case INTEGER:
      jj_consume_token(INTEGER);
                {if (true) return yajco.model.type.PrimitiveType.INTEGER;}
      break;
    case REAL:
      jj_consume_token(REAL);
             {if (true) return yajco.model.type.PrimitiveType.REAL;}
      break;
    case STRING:
      jj_consume_token(STRING);
               {if (true) return yajco.model.type.PrimitiveType.STRING;}
      break;
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.NotationPartPattern NotationPartPatternSymbol() throws ParseException {
  yajco.model.pattern.NotationPartPattern _value = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SEPARATOR:
      _value = SeparatorSymbol();
      break;
    case REFERENCES:
      _value = ReferencesSymbol();
      break;
    case RANGE:
      _value = RangeSymbol();
      break;
    case INDENT:
      _value = IndentSymbol();
      break;
    case NEWLINE:
      _value = NewLineSymbol();
      break;
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return _value;}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.impl.References ReferencesSymbol() throws ParseException {
  java.lang.String name_1 = null;
  Token _tokenname_1 = null;
  java.lang.String property_1 = null;
  Token _tokenproperty_1 = null;
    jj_consume_token(REFERENCES);
    jj_consume_token(_40);
    _tokenname_1 = jj_consume_token(NAME);
                                 name_1 = _tokenname_1.image;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case _44:
      jj_consume_token(_44);
      jj_consume_token(PROPERTY);
      jj_consume_token(_61);
      _tokenproperty_1 = jj_consume_token(NAME);
                                      property_1 = _tokenproperty_1.image;
      break;
    default:
      jj_la1[22] = jj_gen;
      ;
    }
    jj_consume_token(_41);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.References( name_1, property_1), (Object)name_1, property_1);}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.TokenPart TokenPartSymbol() throws ParseException {
  java.lang.String stringValue_1 = null;
  Token _tokenstringValue_1 = null;
    _tokenstringValue_1 = jj_consume_token(STRING_VALUE);
                                                  stringValue_1 = _tokenstringValue_1.image;
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.TokenPart( stringValue_1), (Object)stringValue_1);}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.Language LanguageSymbol() throws ParseException {
  yajco.model.Concept[] concepts_1 = null;
  java.util.List<yajco.model.Concept> _listconcepts_1 = new java.util.ArrayList<yajco.model.Concept>();
  yajco.model.Concept _itemconcepts_1 = null;
  java.lang.String name_2 = null;
  Token _tokenname_2 = null;
  yajco.model.Concept[] concepts_2 = null;
  java.util.List<yajco.model.Concept> _listconcepts_2 = new java.util.ArrayList<yajco.model.Concept>();
  yajco.model.Concept _itemconcepts_2 = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CONCEPT:
      _itemconcepts_1 = ConceptSymbol();
                                                  _listconcepts_1.add(_itemconcepts_1);
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case CONCEPT:
          ;
          break;
        default:
          jj_la1[23] = jj_gen;
          break label_8;
        }
        _itemconcepts_1 = ConceptSymbol();
                                                _listconcepts_1.add(_itemconcepts_1);
      }
    concepts_1 = _listconcepts_1.toArray(new yajco.model.Concept[] {});
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.Language( concepts_1), (Object)concepts_1);}
      break;
    case LANGUAGE:
      jj_consume_token(LANGUAGE);
      _tokenname_2 = jj_consume_token(NAME);
                                name_2 = _tokenname_2.image;
      _itemconcepts_2 = ConceptSymbol();
                                                _listconcepts_2.add(_itemconcepts_2);
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case CONCEPT:
          ;
          break;
        default:
          jj_la1[24] = jj_gen;
          break label_9;
        }
        _itemconcepts_2 = ConceptSymbol();
                                                _listconcepts_2.add(_itemconcepts_2);
      }
    concepts_2 = _listconcepts_2.toArray(new yajco.model.Concept[] {});
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.Language( name_2, concepts_2), (Object)name_2, concepts_2);}
      break;
    default:
      jj_la1[25] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.NotationPart NotationPartSymbol() throws ParseException {
  yajco.model.NotationPart _value = null;
    if (jj_2_4(2)) {
      _value = LocalVariablePartSymbol();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NAME:
        _value = PropertyReferencePartSymbol();
        break;
      case STRING_VALUE:
        _value = TokenPartSymbol();
        break;
      default:
        jj_la1[26] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    {if (true) return _value;}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.impl.Identifier IdentifierSymbol() throws ParseException {
    jj_consume_token(IDENTIFIER);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.Identifier( ));}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.impl.printer.Indent IndentSymbol() throws ParseException {
    jj_consume_token(INDENT);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.printer.Indent( ));}
    throw new Error("Missing return statement in function");
  }

  static final public yajco.model.pattern.impl.Separator SeparatorSymbol() throws ParseException {
  java.lang.String stringValue_1 = null;
  Token _tokenstringValue_1 = null;
    jj_consume_token(SEPARATOR);
    jj_consume_token(_40);
    _tokenstringValue_1 = jj_consume_token(STRING_VALUE);
                                                stringValue_1 = _tokenstringValue_1.image;
    jj_consume_token(_41);
    {if (true) return tuke.pargen.ReferenceResolver.getInstance().register(new yajco.model.pattern.impl.Separator( stringValue_1), (Object)stringValue_1);}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_3R_10() {
    if (jj_scan_token(NAME)) return true;
    if (jj_scan_token(_58)) return true;
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_scan_token(OPERATOR)) return true;
    if (jj_scan_token(_40)) return true;
    if (jj_scan_token(PRIORITY)) return true;
    if (jj_scan_token(_61)) return true;
    if (jj_scan_token(INT_VALUE)) return true;
    if (jj_scan_token(ASSOCIATIVITY)) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_scan_token(PARENTHESES)) return true;
    if (jj_scan_token(_40)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_scan_token(RANGE)) return true;
    if (jj_scan_token(_40)) return true;
    if (jj_scan_token(INT_VALUE)) return true;
    if (jj_scan_token(_46_46)) return true;
    if (jj_scan_token(_42)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** User defined Token Manager. */
  static public TokenManager token_source;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[27];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x1000,0x0,0x800000,0x800003e,0x2000,0x0,0x1000,0x780000,0x800,0x802000,0x1000,0x1000000,0x4000000,0x80000000,0x40000000,0x20000000,0x1000,0x120,0x802000,0x1e,0x0,0x1000000,0x400,0x400,0x400,0x120,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0xcb,0x0,0x8,0x0,0x0,0x0,0xcb,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xcb,0x0,0x0,0x0,0x100,0x0,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[4];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;


  /** Constructor with user supplied Token Manager. */
  public Parser(TokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 27; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 27; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[41];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 27; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 41; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 4; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

                     }
