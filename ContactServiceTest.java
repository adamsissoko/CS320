import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class ContactServiceTest
{

  protected String c_id, n_firstTest, n_lastTest, num_phoneTest, addressTest;

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
   @Test void contact_new_test ()
  {

    ContactService service = new ContactService ();

    service.contact_new ();

    assertAll ("service",
	       ()->assertNotNull (service.getContList ().get (0).getc_id ()),
	       ()->assertEquals ("Initial",
				 service.getContList ().
				 get (0).getn_first ()),
	       ()->assertEquals ("Initial",
				 service.getContList ().get (0).getn_last ()),
	       ()->assertEquals ("1234567890",
				 service.getContList ().
				 get (0).getnum_phone ()),
	       ()->assertEquals ("Initial",
				 service.getContList ().
				 get (0).getAddress ()));

    service.contact_new (n_firstTest);

    assertAll ("service",
	       ()->assertNotNull (service.getContList ().get (1).getc_id ()),
	       ()->assertEquals (n_firstTest,
				 service.getContList ().
				 get (1).getn_first ()),
	       ()->assertEquals ("Initial",
				 service.getContList ().get (1).getn_last ()),
	       ()->assertEquals ("1234567890",
				 service.getContList ().
				 get (1).getnum_phone ()),
	       ()->assertEquals ("Initial",
				 service.getContList ().
				 get (1).getAddress ()));

    service.contact_new (n_firstTest, n_lastTest)
      assertAll ("service",
		 ()->assertNotNull
		 (service.getContList
		  ().get (2).getc_id
		  ()),
		 ()->assertEquals
		 (n_firstTest,
		  service.getContList
		  ().get (2).getn_first
		  ()),
		 ()->assertEquals
		 (n_lastTest,
		  service.getContList
		  ().get (2).getn_last
		  ()),
		 ()->assertEquals
		 ("1234567890",
		  service.getContList
		  ().get (2).getnum_phone
		  ()),
		 ()->assertEquals
		 ("Initial", service.getContList ().get (2).getAddress ()));

    service.contact_new (n_firstTest, n_lastTest, num_phoneTest);

    assertAll ("service",
	       ()->assertNotNull (service.getContList ().get (3).getc_id ()),
	       ()->assertEquals (n_firstTest,
				 service.getContList ().
				 get (3).getn_first ()),
	       ()->assertEquals (n_lastTest,
				 service.getContList ().get (3).getn_last ()),
	       ()->assertEquals (num_phoneTest,
				 service.getContList ().
				 get (3).getnum_phone ()),
	       ()->assertEquals ("Initial",
				 service.getContList ().
				 get (3).getAddress ()));

    service.contact_new (n_firstTest, n_lastTest, num_phoneTest, addressTest);

    assertAll ("service",
	       ()->assertNotNull (service.getContList ().get (4).getc_id ()),
	       ()->assertEquals (n_firstTest,
				 service.getContList ().
				 get (4).getn_first ()),
	       ()->assertEquals (n_lastTest,
				 service.getContList ().get (4).getn_last ()),
	       ()->assertEquals (num_phoneTest,
				 service.getContList ().
				 get (4).getnum_phone ()),
	       ()->assertEquals (addressTest,
				 service.getContList ().
				 get (4).getAddress ()));

  }
  @Test void ContactTest_Delete ()
  {

    ContactService service = new ContactService ();

    service.contact_new ();

    assertThrows (Exception.class, ()->service.contact_delete (c_id));

    assertAll (()->
	       service.contact_delete (service.getContList ().
				       get (0).getc_id ()));

  }
  @Test void n_firstTest_update () throws Exception
  {

    ContactService service = new ContactService ();

      service.contact_new ();

      service.n_first_update (service.getContList ().get (0).getc_id (),
			      n_firstTest);

      assertEquals (n_firstTest,
		    service.getContList ().get (0).getn_first ());

      assertThrows (IllegalArgumentException.class,
		    ()->service.n_first_update (service.
						getContList ().get (0).
						getc_id (), n_first_long));

      assertThrows (IllegalArgumentException.class,
		    ()->service.n_first_update (service.
						getContList ().get (0).
						getc_id (), null));

      assertThrows (Exception.class,
		    ()->service.n_first_update (c_id, n_firstTest));

  }
   @Test void n_last_updateTest () throws Exception
  {

    ContactService service = new ContactService ();

      service.contact_new ();

      service.n_last_update (service.getContList ().get (0).getc_id (),
			     n_lastTest);

      assertEquals (n_lastTest, service.getContList ().get (0).getn_last ());

      assertThrows (IllegalArgumentException.class,
		    ()->service.n_last_update (service.getContList ().get (0).
					       getc_id (), n_last_long));

      assertThrows (IllegalArgumentException.class,
		    ()->service.n_last_update (service.getContList ().get (0).
					       getc_id (), null));

      assertThrows (Exception.class,
		    ()->service.n_last_update (c_id, n_lastTest));

  }
   @Test void num_phone_updateTest () throws Exception
  {

    ContactService service = new ContactService ();

      service.contact_new ();

      service.num_phone_update (service.getContList ().get (0).getc_id (),
				num_phoneTest);

      assertEquals (num_phoneTest,
		    service.getContList ().get (0).getnum_phone ());

      assertThrows (IllegalArgumentException.class,
		    ()->service.
		    num_phone_update (service.getContList ().get (0).
				      getc_id (), num_phone_long));

      assertThrows (IllegalArgumentException.class,
		    ()->service.
		    num_phone_update (service.getContList ().get (0).
				      getc_id (), num_phone_short));

      assertThrows (IllegalArgumentException.class,
		    ()->service.
		    num_phone_update (service.getContList ().get (0).
				      getc_id (), c_id));

      assertThrows (IllegalArgumentException.class,
		    ()->service.
		    num_phone_update (service.getContList ().get (0).
				      getc_id (), null));

      assertThrows (Exception.class,
		    ()->service.num_phone_update (c_id, n_lastTest));

  }
   @Test void addresstest_update () throws Exception
  {

    ContactService service = new ContactService ();

      service.contact_new ();

      service.address_update (service.getContList ().get (0).getc_id (),
			      addressTest);

      assertEquals (addressTest,
		    service.getContList ().get (0).getAddress ());

      assertThrows (IllegalArgumentException.class,
		    ()->service.address_update (service.
						getContList ().get (0).
						getc_id (), Address_long));

      assertThrows (IllegalArgumentException.class,
		    ()->service.address_update (service.
						getContList ().get (0).
						getc_id (), null));

      assertThrows (Exception.class,
		    ()->service.address_update (c_id, addressTest));

  }
}
