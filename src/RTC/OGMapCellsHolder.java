package RTC;


/**
* RTC/OGMapCellsHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef OGMapCells
     */
public final class OGMapCellsHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public OGMapCellsHolder ()
  {
  }

  public OGMapCellsHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.OGMapCellsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.OGMapCellsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.OGMapCellsHelper.type ();
  }

}