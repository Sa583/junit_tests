package com.example.dom.kv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 */

public class SqSolveTest
{
    @Test
    public void creation() throws Exception {
        SqSolve sq = new SqSolve();
    }

    @Test
    public void solve1() throws Exception {
        SqSolve sq = new SqSolve();

        sq.setA( 2 );
        sq.setB( 1 );
        sq.setC( 1 );

        assertEquals( true, sq.solve() );

        assertEquals( 2, sq.x.size() );
        assertEquals( 0.5, sq.x.get(0), 1e-6 );
        assertEquals( -1, sq.x.get(1), 1e-6 );
    }

    @Test
    public void negativeD() throws Exception {
        SqSolve sq = new SqSolve();

        sq.setA( 2 );
        sq.setB( 1 );
        sq.setC( -1 );

        assertEquals( false, sq.solve() );
    }
    @Test
    public void zero() throws Exception {
        SqSolve sq = new SqSolve();

        sq.setA( 0 );
        sq.setB( 0 );
        sq.setC( 0 );

        assertEquals( false, sq.solve() );
    }
    @Test
    public void zero2() throws Exception {
        SqSolve sq = new SqSolve();

        sq.setA( 0 );
        sq.setB( 0 );
        sq.setC( 5 );

        assertEquals( false, sq.solve() );
    }
    @Test
    public void linear() throws Exception {
        SqSolve sq = new SqSolve();

        sq.setA( 0 );
        sq.setB( 5 );
        sq.setC( 10 );

        assertEquals( true, sq.solve() );
        assertEquals( -2, sq.x.get(0), 1e-6 );
    }


}
