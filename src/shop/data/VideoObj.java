package shop.data;

/**
 * Implementation of Video interface.
 * @see Data
 */
final class VideoObj implements Video {
  private final String _title;
  private final int    _year;
  private final String _director;

  /**
   * Initialize all object attributes.
   * Title and director are "trimmed" to remove leading and final space.
   * @throws IllegalArgumentException if object invariant violated.
   */
  VideoObj(String title, int year, String director) {
    _title = title.trim();
    _director = director.trim();
    _year = year;
  }

  public String director() {
    // TODO
    return _director;
  }

  public String title() {
    // TODO
    return _title;
  }

  public int year() {
    // TODO
    return _year;
  }

  public boolean equals(Object thatObject) {
    // TODO
	  if(this == thatObject)
		  return true;
	  
	  if (!(thatObject instanceof VideoObj))
	  {
		  return false;
	  }
	  VideoObj that = (VideoObj) thatObject;
	  return _title.equals(that._title) && _year == that._year && _director.equals(that._director);
  }

  public int hashCode() {
    // TODO
	  int hcode = 17;
	  hcode = 37*hcode + _title.hashCode();
      hcode = 37*hcode + _year;
      hcode = 37*hcode + _director.hashCode();
      return hcode;
  }

  public int compareTo(Video that) {
    // TODO
	  VideoObj v = (VideoObj)that;
	  int result = _title.compareTo(v._title);
		if(result == 0)
		{
			result = _year - v._year;
			if( result == 0)
				result = _director.compareTo(v._director);
		}
		
	    return result;
  }

  public String toString() {
    // TODO
	  String result = _title + " (" + _year + ") : " + _director;
	  return result;
  }
}
