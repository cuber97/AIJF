import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private static final DecimalFormat _format = new DecimalFormat();

    static {
        DecimalFormatSymbols _symbols = new DecimalFormatSymbols();
        _symbols.setDecimalSeparator('.');
        _symbols.setGroupingSeparator(Character.MIN_VALUE);
        _format.setDecimalFormatSymbols(_symbols);
    }

    static double parse(String text) throws ParseException {
        return _format.parse(text).doubleValue();
    }

    public static void main(String[] args) {
        while(true) {
            String input ="";
            out.println("Key in the input string:");
            Scanner reader = new Scanner(System.in);
            try  {
                input = reader.nextLine();
            }catch (Exception e){}

            if(input.equals("exit")){return;}

            CharStream charStream = CharStreams.fromString(input);
            AijfLexer lexer = new AijfLexer(charStream);
            TokenStream tokenStream = new CommonTokenStream(lexer);
            AijfParser parser = new AijfParser(tokenStream);
            parser.removeErrorListeners();
            parser.setBuildParseTree(true);
            ParseTree tree = parser.expression();
            int errors = parser.getNumberOfSyntaxErrors();
            System.out.println("Errors " + errors);
            out.println(tree.toStringTree(parser));

            if (0 == errors) {

                TreeEvaluationVisitor visitor = new TreeEvaluationVisitor();
                visitor.visit(tree);
            }
        }
    }

}
