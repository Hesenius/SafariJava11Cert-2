package annotations;

import java.lang.annotation.Repeatable;

@Repeatable(BucketOfMe.class)
public @interface ManyMe {
}

@interface BucketOfMe {
  ManyMe[] value();
}
