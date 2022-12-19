import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class ContactTest
{

  protected String c_id, ntest_first, ntest_last, test_num_phone,
    test_address;

  protected String c_id_long, n_first_long, n_last_long,
    num_phone_long, num_phone_short, address_long;

   @BeforeEach void startup ()
  {

    c_id = "10293A475F";

    n_firstTest = "ABC";

    n_lastTest = "DEF";

    num_phoneTest = "1234567890";

    addressTest = "123 Sesame Street Texas City NY 07305";

    c_id_long = "00998866554433322114";

    n_first_long = "Joseph William James";

    n_last = "Greenman Jackson";

    num_phone_long = "424123912393";

    num_phone_short = "4832942";

    Address_long = "1 Sesame Street Drive, Texas City, NJ 07305";

  }
   @Test void contactTest ()
  {

    Contact contact = new Contact ();

    assertAll ("Constructor:",
	       ()->assertNotNull (contact.getc_id ()),
	       ()->assertNotNull (contact.getn_last ()),
	       ()->assertNotNull (contact.getn_last ()),
	       ()->assertNotNull (contact.getnum_phone ()),
	       ()->assertNotNull (contact.getAddress ()));

  }
  @Test void c_id_test_construc ()
  {

    Contact contact = new Contact (c_id);

    assertAll ("Constructor 1:",
	       ()->assertEquals (c_id, contact.getc_id ()),
	       ()->assertNotNull (contact.getn_last ()),
	       ()->assertNotNull (contact.getn_last ()),
	       ()->assertNotNull (contact.getnum_phone ()),
	       ()->assertNotNull (contact.getAddress ()));

  }
  @Test void c_id_and_n_last_test_construc ()
  {

    Contact contact = new Contact (c_id, ntest_first);

    assertAll ("Constructor 2:",
	       ()->assertEquals (c_id, contact.getc_id ()),
	       ()->assertEquals (ntest_first, contact.getn_last ()),
	       ()->assertNotNull (contact.getn_last ()),
	       ()->assertNotNull (contact.getnum_phone ()),
	       ()->assertNotNull (contact.getAddress ()));

  }
  @Test void c_id_and_n_full_test_construc ()
  {

    Contact contact = new Contact (c_id, ntest_first, ntest_last);

    assertAll ("Constructor 3:",
	       ()->assertEquals (c_id, contact.getc_id ()),
	       ()->assertEquals (ntest_first, contact.getn_last ()),
	       ()->assertEquals (ntest_last, contact.getn_last ()),
	       ()->assertNotNull (contact.getnum_phone ()),
	       ()->assertNotNull (contact.getAddress ()));

  }
  @Test void c_idn_fullnum_phone_test_construc ()
  {

    Contact contact =
      new Contact (c_id, ntest_first, ntest_last, test_num_phone);

    assertAll ("Constructor 4:",
	       ()->assertEquals (c_id, contact.getc_id ()),
	       ()->assertEquals (ntest_first, contact.getn_last ()),
	       ()->assertEquals (ntest_last, contact.getn_last ()),
	       ()->assertEquals (test_num_phone,
				 contact.getnum_phone ()),
	       ()->assertNotNull (contact.getAddress ()));

  }
  @Test void allTheProperThings_test_construc ()
  {

    Contact contact = new Contact (c_id, ntest_first, ntest_last,
				   test_num_phone,
				   test_address);

    assertAll ("All Constructors",
	       ()->assertEquals (c_id, contact.getc_id ()),
	       ()->assertEquals (ntest_first, contact.getn_last ()),
	       ()->assertEquals (ntest_last, contact.getn_last ()),
	       ()->assertEquals (test_num_phone,
				 contact.getnum_phone ()),
	       ()->assertEquals (test_address, contact.getAddress ()));

  }
  @Test void update_ntest_first ()
  {

    Contact contact = new Contact ();

    contact.update_n_last (ntest_first);

    assertAll ("First Names:",
	       ()->assertEquals (ntest_first, contact.getn_last ()),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.update_n_last (null)),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.update_n_last (n_last_long)));

  }
  @Test void update_ntest_last ()
  {

    Contact contact = new Contact ();

    contact.update_n_last (ntest_last);

    assertAll ("Last Names:",
	       ()->assertEquals (ntest_last, contact.getn_last ()),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.update_n_last (null)),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.update_n_last (n_last_long)));

  }
  @Test void updatetest_num_phone ()
  {

    Contact contact = new Contact ();

    contact.updatenum_phone (test_num_phone);

    assertAll ("Phone Numbers:",
	       ()->assertEquals (test_num_phone,
				 contact.getnum_phone ()),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.updatenum_phone (null)),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->
				 contact.updatenum_phone (num_phone_long)),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->
				 contact.updatenum_phone (num_phone_short)),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.updatenum_phone (c_id)));

  }
  @Test void updatetest_address ()
  {

    Contact contact = new Contact ();

    contact.update_address (test_address);

    assertAll ("Phone Numbers: ",
	       ()->assertEquals (test_address, contact.getAddress ()),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.update_address (null)),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.update_address (address_long)));

  }
  @Test void c_id_updateTest ()
  {

    Contact contact = new Contact ();

    contact.c_id_update (c_id);

    assertAll ("Contact ID: ",
	       ()->assertEquals (c_id, contact.getc_id ()),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.c_id_update (null)),
	       ()->assertThrows (IllegalArgumentException.class,
				 ()->contact.c_id_update (c_id_long)));

  }
}
