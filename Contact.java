public class Contact
{

  private static final int LENGTH_NUM_PHONE = 10;

  private static final byte LENGTH_C_ID = 10;

  private static final byte LENGTH_N_FIRST = 10;

  private static final byte LENGTH_N_LAST = 10;

  private static final byte LENGTH_ADDRESS = 30;

  private static final String INITIALIZER = "INITIAL";

  private static final String INITIALIZER_NUM = "1235559999";

  private String c_id;

  private String n_first;

  private String n_last;

  private String num_phone;

  private String address;

    Contact ()
  {

    this.c_id = INITIALIZER;

    this.n_first = INITIALIZER;

    this.n_last = INITIALIZER;

    this.address = INITIALIZER;

    this.num_phone = INITIALIZER_NUM;

  }
  Contact (String c_id)
  {

    c_id_update (c_id);

    this.n_first = INITIALIZER;

    this.n_last = INITIALIZER;

    this.address = INITIALIZER;

    this.num_phone = INITIALIZER_NUM;

  }
  Contact (String c_id, String n_first)
  {

    c_id_update (c_id);

    n_first_update (n_first);

    this.n_last = INITIALIZER;

    this.address = INITIALIZER;

    this.num_phone = INITIALIZER_NUM;

  }
  Contact (String c_id, String n_first, String n_last)
  {

    c_id_update (c_id);

    n_first_update (n_first);

    n_last_update (n_last);

    this.address = INITIALIZER;

    this.num_phone = INITIALIZER_NUM;

  }
  Contact (String c_id, String n_first, String n_last, String num_phone)
  {

    c_id_update (c_id);

    n_first_update (n_first);

    n_last_update (n_last);

    num_phone_update (num_phone);

    this.address = INITIALIZER;

  }
  Contact (String c_id, String n_first, String n_last,
	   String num_phone, String address)
  {

    c_id_update (c_id);

    n_first_update (n_first);

    n_last_update (n_last);

    num_phone_update (num_phone);

    address_update (address);

  }
  protected final String getc_id ()
  {
    return c_id;
  }

  protected final String getn_first ()
  {
    return n_first;
  }

  protected final String getn_last ()
  {
    return n_last;
  }

  protected final String getnum_phone ()
  {
    return num_phone;
  }

  protected final String getAddress ()
  {
    return address;
  }

  protected void n_first_update (String n_first)
  {

    if (n_first == null)
      {

	throw new IllegalArgumentException ("First name cannot be empty");

      }
    else if (n_first.length () > LENGTH_N_FIRST)
      {

	throw new
	  IllegalArgumentException ("First name cannot be longer than " +
				    LENGTH_N_FIRST + " characters");

      }
    else
      {

	this.n_first = n_first;

      }

  }

  protected void n_last_update (String n_last)
  {

    if (n_last == null)
      {

	throw new IllegalArgumentException ("Please enter a last name.");

      }
    else if (n_last.length () > LENGTH_N_LAST)
      {

	throw new
	  IllegalArgumentException ("The last name can't have more than " +
				    LENGTH_N_LAST + " characters.");

      }
    else
      {

	this.n_last = n_last;

      }

  }

  protected void num_phone_update (String num_phone)
  {

    String regex = "[0-9]+";

    if (num_phone == null)
      {

	throw new IllegalArgumentException ("Please enter a phone number");

      }
    else if (num_phone.length () != LENGTH_NUM_PHONE)
      {

	throw new
	  IllegalArgumentException
	  ("Invalid phone number length, number needs to have " +
	   LENGTH_NUM_PHONE + " digits.");

      }
    else if (!num_phone.matches (regex))
      {

	throw new
	  IllegalArgumentException
	  ("The Phone number can only include numbers. ");

      }
    else
      {

	this.num_phone = num_phone;

      }

  }

  protected void address_update (String address)
  {

    if (address == null)
      {

	throw new IllegalArgumentException ("Please enter an address");

      }
    else if (address.length () > LENGTH_ADDRESS)
      {

	throw new
	  IllegalArgumentException ("The address can't have more than " +
				    LENGTH_ADDRESS + " characters.");

      }
    else
      {

	this.address = address;

      }

  }

  protected void c_id_update (String c_id)
  {

    if (c_id == null)
      {

	throw new IllegalArgumentException ("Please enter a Contact ID ");

      }
    else if (c_id.length () > LENGTH_C_ID)
      {

	throw new
	  IllegalArgumentException ("The Contact ID can't have more than " +
				    LENGTH_C_ID + " characters.");

      }
    else
      {

	this.c_id = c_id;

      }

  }

}
