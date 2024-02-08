# n19
---

implementationOfNeobisTasks  


![pic from redhat.com](https://developers.redhat.com/sites/default/files/styles/list_item_thumb/public/ST-java1_1x%20%283%29_3.png?itok=mn2zw0CD)
___

### **Study paln:**

Week1

* solved ps

* learned using git command line

  ---

```java

@Service
@RequiredArgsConstructor
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService {
    private final OrderDetailRepo orderDetailRepo;
    private final PriceService priceService;
    private final DiscountService discountService;
    private final AddressService addressService;

```

* `author` - Kamchybek Al
* `date` - The date of creation `2023-07-20 01:32`
