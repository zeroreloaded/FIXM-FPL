package net.styx.swim.fixm;

import aero.fixm.base._4.*;
import aero.fixm.flight._4.*;
import aero.fixm.messaging._4.*;
import net.styx.swim.fixm.utils.*;
import java.util.*;

public interface IFIXMFactory
{
    public AbstractFIXMBuilder createBuilder(String type);
}
