package com.functional;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by sdierbec on 5/14/15.
 */
public class ReductionsTest {
    static Reductions reductions;
    final List friends =
            Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott", "Stephen", "Ian");
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        reductions = new Reductions();
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void returnsLongestNameFromList()
    {

        String longestName = reductions.pickLongestName(friends);
        assertNotNull(longestName);
        assertEquals("Stephen".length(), longestName.length());
    }

    @Test
    public void returnsShortestNameFromList()
    {
        String shortestName = reductions.pickShortestName(friends);
        assertNotNull(shortestName);
        assertEquals("Ian".length(), shortestName.length());
    }

}
