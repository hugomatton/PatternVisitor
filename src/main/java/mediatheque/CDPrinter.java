package mediatheque;

public class CDPrinter implements ItemVisitor{

    @Override //Quand CDPrinter rencontre un book on renvoie null
    public void visit(Book book) {
    }

    @Override //Quand CDPrinter rencontre un CD on renvoie le titre de ce dernier
    public void visit(CD cd) {
        System.out.println(cd.toString());
    }
    

    
}
