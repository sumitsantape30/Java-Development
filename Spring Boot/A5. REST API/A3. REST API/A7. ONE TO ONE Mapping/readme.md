humari application mai components hai like dao, entities and services.
Entities important hai kyuki entities define krti hai database. means jaisi entitied hogi waisa database hoga. jo bhi kam aap entities ke sath krte ho woh database ke 
sath sync hojata hai. 

Book.java yeh entity humari define krhi hai database ko, aur id, authors yeh columns hai table ke. inke datatypes primitives hai but agar mujhe author ki aur information store krni hai to iss Author ka datatype object rakh skta hu, aur Author class create krke usme author ki properties rahegi.
means nesting krhe ek object ke andar dusra object.

OneToOne matlab ek book ko ek hi author ho skta hai aisa hum implement krhe.
