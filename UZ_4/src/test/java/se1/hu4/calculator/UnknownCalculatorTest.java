package se1.hu4.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnknownCalculatorTest {

    // Das Testobjekt dieser Testklasse:
	UnknownCalculator uc;
	

	// static: Wird einmalig ausgeführt, vor allen Tests auch jene mit @BeforeEach markierten.
    @BeforeAll
    static void setup(){
        System.out.println(">>@BeforeAll");

    }
     
    // Wird vor jedem einzelnen Test ausgeführt
    // Zweck: Ein "frisches" Testobjekt für Test vorbereiten: Instantieren, initialisieren, Ressourcen vorbereiten etc.
    @BeforeEach
    void setupThis(){
        uc= new UnknownCalculator();
        uc.switchOn();
    }
    


    // Ein Beispieltest mit assert.

    //diverse Tests
    /**
     * @implNote is calculator off when created
     */
    @Test
    public void test_whencreatedisoff(){
        uc = new UnknownCalculator();
        assertEquals(uc.isOn(),false);
        uc.switchOn();
    }
    /**
     * @implNote is calculator on when turned on
     */
    @Test
    public void test_whenturnedonison(){
        assertEquals(uc.isOn(),true);
    }
    /**
     * @throws IllegalStateException Checks if program tried to switch on calculator when it was already on
     */
    @Test
    public void test_error_switchon_if_on(){
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> {
            uc.switchOn();
        }, "IllegalStateException was expected");
        assertEquals("Calculator is not off!", thrown.getMessage());
    }

    /**
     * @throws IllegalStateException Checks if program tried to switch off calculator when it was already off
     */
    @Test
    public void test_error_switchoff_if_off(){
        uc.switchOff();
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> {
            uc.switchOff();
        }, "IllegalStateException was expected");
        assertEquals("Calculator is not on!", thrown.getMessage());
        uc.switchOn();
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for an invalid operator
     */
    @Test
    public void test_error_when_wrong_operator(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("2", "2", '!');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid operator!", thrown.getMessage());
    }

    //Addition

    /**
     * @implNote tries to add 2 and 2
     */
    @Test
    void addition_2_2() {
        assertEquals( 4, uc.calc("2","2", '+'), "2 + 2 sollte 4 ergeben.");
    }
    /**
     * @implNote tries to add 1 and 3
     */
    @Test
    void addition_1_3() {
        assertEquals( 3, uc.calc("1","2", '+'), "1 + 2 sollte 3 ergeben.");
    }
    /**
     * @implNote tries to add 1000 and 1000
     */
    @Test
    void addition_1000_1000() {
        assertEquals( 2000, uc.calc("1000","1000", '+'), "1000 + 1000 sollte 2000 ergeben.");
    }
    /**
     * @implNote tries to add 2.3 and 3.2
     */
    @Test
    void addition_2_3_3_2() {
        assertEquals( 5.5, uc.calc("2.3","3.2", '+'), "2.3 + 3.2 sollte 5.5 ergeben.");
    }
    /**
     * @implNote tries to add -2 and -2
     */
    @Test
    void addition_N2_N2() {
        assertEquals( -4, uc.calc("-2","-2", '+'), "-2 + -2 sollte -4 ergeben.");
    }
    /**
     * @implNote tries to add -2 and 2
     */
    @Test
    void addition_N2_2() {
        assertEquals( 0, uc.calc("2","-2", '+'), "2 + -2 sollte 0 ergeben.");
    }
    /**
     * @implNote tries to add 2 and -2
     */
    @Test
    void addition_2_N2() {
        assertEquals( 0, uc.calc("-2","2", '+'), "-2 + 2 sollte 0 ergeben.");
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for argument out of bounds
     */
    @Test
    void addition_out_of_bounds_x() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("10000","1000", '+');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument x, out of bounds!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for argument out of bounds
     */
    @Test
    void addition_out_of_bounds_y() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("1000","10000", '+');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, out of bounds!", thrown.getMessage());
    }

    /**
     * @throws IllegalStateException Checks if code is throwing a IllegalStateException if calculator is off, when it shouldn't be off
     */
    @Test
    void addition_when_off(){
        uc.switchOff();
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> {
            uc.calc("-2","-2", '+');
        }, "IllegalStateException was expected");
        assertEquals("Calculator is not on!", thrown.getMessage());
        uc.switchOn();
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for a string argument
     */
    @Test
    void addition_when_x_is_string(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc(" ","-2", '+');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument x, it is a string!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for a string argument
     */
    @Test
    void addition_when_y_is_string(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("-2","bla", '+');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, it is a string!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for an empty argument
     * @implNote tries to add while y is only a empty string
     */
    @Test
    void addition_when_y_is_empty(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("-2","", '+');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, it is a string!", thrown.getMessage());
    }
    //Subtraction
    /**
     * @implNote tries to subtract 2 from 2
     */
    @Test
    void subtraction_2_2() {
        assertEquals( 0.0, uc.calc("2","2", '-'), "2 - 2 sollte 0 ergeben.");
    }
    /**
     * @implNote tries to subtract 1000 from 1000
     */
    @Test
    void subtraction_1000_1000() {
        assertEquals( 0.0, uc.calc("1000","1000", '-'), "1000 - 1000 sollte 0 ergeben.");
    }
    /**
     * @implNote tries to subtract 1 from -1000
     */
    @Test
    void subtraction_N1000_1() {
        assertEquals( -1001, uc.calc("-1000","1", '-'), "-1000 - 1 sollte -1001 ergeben.");
    }
    /**
     * @implNote tries to subtract 1 from -1
     */
    @Test
    void subtraction_N1_1() {
        assertEquals( -2, uc.calc("-1","1", '-'), "-1 - 1 sollte -2 ergeben.");
    }
    /**
     * @implNote tries to subtract 2 from 0
     */
    @Test
    void subtraction_0_2() {
        assertEquals( -2.0, uc.calc("0","2", '-'), "0 - 2 sollte -2 ergeben.");
    }
    /**
     * @implNote tries to subtract -2 from -3
     */
    @Test
    void subtraction_N3_N2() {
        assertEquals( -1.0, uc.calc("-3","-2", '-'), "-3 - -2 sollte -1 ergeben.");
    }
    /**
     * @implNote tries to subtract -3 from -2
     */
    @Test
    void subtraction_N2_N3() {
        assertEquals( 1.0, uc.calc("-2","-3", '-'), "-2 - -3 sollte 1 ergeben.");
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for argument out of bounds
     */
    @Test
    void subtraction_out_of_bounds_x() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("10000","1000", '+');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument x, out of bounds!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for argument out of bounds
     */
    @Test
    void subtraction_out_of_bounds_y() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("1000","10000", '+');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, out of bounds!", thrown.getMessage());
    }

    /**
     * @throws IllegalStateException Checks if code is throwing a IllegalStateException if calculator is off, when it shouldn't be off
     */
    @Test
    void subtraction_when_off(){
        uc.switchOff();
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> {
            uc.calc("-2","-2", '-');
        }, "IllegalStateException was expected");
        assertEquals("Calculator is not on!", thrown.getMessage());
        uc.switchOn();
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for a string argument
     */
    @Test
    void subtraction_when_x_is_string(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc(" ","-2", '-');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument x, it is a string!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for a string argument
     */
    @Test
    void subtraction_when_y_is_string(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("-2","bla", '-');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, it is a string!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for an empty argument
     */
    @Test
    void subtraction_when_y_is_empty(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("-2","", '-');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, it is a string!", thrown.getMessage());
    }

    //Multiplication
    /**
     * @implNote tries to multiply 2 with 2
     */

    @Test
    void multiplication_2_2() {
        assertEquals( 4.0, uc.calc("2","2", '*'), "2 * 2 sollte 4 ergeben.");
    }
    /**
     * @implNote tries to multiply 0 with 2
     */

    @Test
    void multiplication_0_2() {
        assertEquals( 0.0, uc.calc("0","2", '*'), "0 * 2 sollte 0 ergeben.");
    }
    /**
     * @implNote tries to multiply 1000 with 1000
     */

    @Test
    void multiplication_1000_1000() {
        assertEquals( 1000000, uc.calc("1000","1000",'*'), "1000 * 1000 sollte 1000000 ergeben.");
    }

    /**
     * @implNote tries to multiply 1.1 with 1.1
     */
    @Test
    void multiplication_1_1_1_1() {
        assertEquals( 1.21, uc.calc("1.1", "1.1", '*'), 0.00000000000002, "1.1 * 1.1 sollte 1.21 ergeben");
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for argument out of bounds
     */
    @Test
    void multiplication_out_of_bounds_x() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("10000","1000", '*');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument x, out of bounds!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for argument out of bounds
     */
    @Test
    void multiplication_out_of_bounds_y() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("1000","10000", '*');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, out of bounds!", thrown.getMessage());
    }

    /**
     * @throws IllegalStateException Checks if code is throwing a IllegalStateException if calculator is off, when it shouldn't be off
     */
    @Test
    void multiplication_when_off(){
        uc.switchOff();
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> {
            uc.calc("-2","-2", '*');
        }, "IllegalStateException was expected");
        assertEquals("Calculator is not on!", thrown.getMessage());
        uc.switchOn();
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for a string argument
     */
    @Test
    void multiplication_when_x_is_string(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc(" ","-2", '*');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument x, it is a string!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for a string argument
     */
    @Test
    void multiplication_when_y_is_string(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("-2","bla", '*');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, it is a string!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for an empty argument
     */
    @Test
    void multiplication_when_y_is_empty(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("-2","", '*');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, it is a string!", thrown.getMessage());
    }

    //Division

    /**
     * @implNote tries to divide: 2/2
     */
    @Test
    void division_2_2() {
        assertEquals( 1.0, uc.calc("2","2", '/'), "2 / 2 sollte 1 ergeben.");
    }

    /**
     * @implNote tries to divide: 1.1/1.1
     */
    @Test
    void division_1_1_1_1() {
        assertEquals( 1.0, uc.calc("1.1", "1.1", '/'), "1.1 / 1.1 sollte 1 ergeben.");
    }

    /**
     * @throws ArithmeticException Checks if code is throwing a ArithmeticException for division by zero
     */
    @Test
    void division_2_0() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
            uc.calc("2", "0", '/');
        }, "ArithmeticException was expected");
        assertEquals( "Division by zero!", thrown.getMessage());
    }

    /**
     * @implNote tries to divide: 150/100
     */
    @Test
    void division_150_100() {
        assertEquals( 1.5, uc.calc("150", "100", '/'),"150 / 100 sollte 1.5 ergeben.");
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for argument out of bounds
     */
    @Test
    void division_out_of_bounds_x() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("10000","1000", '/');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument x, out of bounds!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for argument out of bounds
     */
    @Test
    void division_out_of_bounds_y() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("1000","10000", '/');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, out of bounds!", thrown.getMessage());
    }

    /**
     * @throws IllegalStateException Checks if code is throwing a IllegalStateException if calculator is off, when it shouldn't be off
     */
    @Test
    void division_when_off(){
        uc.switchOff();
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> {
            uc.calc("-2","-2", '/');
        }, "IllegalStateException was expected");
        assertEquals("Calculator is not on!", thrown.getMessage());
        uc.switchOn();
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for a string argument
     */
    @Test
    void division_when_x_is_string(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc(" ","-2", '/');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument x, it is a string!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for a string argument
     */
    @Test
    void division_when_y_is_string(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("-2","bla", '/');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, it is a string!", thrown.getMessage());
    }

    /**
     * @throws IllegalArgumentException Checks if code is throwing a IllegalArgumentException for an empty argument
     */
    @Test
    void division_when_y_is_empty(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            uc.calc("-2","", '/');
        }, "IllegalArgumentException was expected");
        assertEquals("Invalid argument y, it is a string!", thrown.getMessage());
    }
    // Wird nach jedem einzelnen Test ausgeführt
    // Zweck: Das Testobjekt herunterfsahren: Ressourcen freigeben etc.

    @AfterEach
    void shutdownThis(){
        uc.switchOff();
    }
     
    @AfterAll
    static void shutdown(){
        System.out.println(">>@AfterAll");
    }
}

