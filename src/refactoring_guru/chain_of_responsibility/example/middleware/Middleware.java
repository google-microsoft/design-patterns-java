package refactoring_guru.chain_of_responsibility.example.middleware;

/**
 * EN: Base middleware class.
 *
  */
public abstract class Middleware {
    private Middleware next;

    /**
     * EN: Builds chains of middleware objects.
     *
          */
    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * EN: Subclasses will implement this method with concrete checks.
     *
          */
    public abstract boolean check(String email, String password);

    /**
     * EN: Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     *
          * мы в последнем элементе цепи.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
