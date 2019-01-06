package com.example.dom.kv;

import java.util.ArrayList;

/**
 */

public class SqSolve {
    double a, b, c;
    public ArrayList<Double> x;

    public SqSolve()
    {
        x = new ArrayList<Double>();
    }

    public void setA( double _a )
    {
        a = _a;
    }
    public void setB( double _b )
    {
        b = _b;
    }
    public void setC( double _c )
    {
        c = _c;
    }

    public boolean solve()
    {
        double d;

        x.clear();

        if (Math.abs(a) < 1e-6 )
        {
            if (Math.abs(b) < 1e-6)
                return false;

            x.add( -c / b );

            return true;
        } // */

        d = b*b - 4*a*c;
        if (d < 0)
            return false;

        if (Math.abs(d) < 1e-6) // epsilon
            x.add( -b / (2*a) );
        else
            {
                x.add( (-b + Math.sqrt(d)) / (2*a) );
                x.add( (-b - Math.sqrt(d)) / (2*a) );
            }

        return true;
    }
}
