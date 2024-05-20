package pl.zajavka;

public class AmountCalculationServiceImpl implements AmountsCalculationService{

    private final ConstantAmountCalculationService constantAmountCalculationService;
    private final DecreasingAmountCalculationService decreasingAmountCalculationService;

    public AmountCalculationServiceImpl(ConstantAmountCalculationService constantAmountCalculationService,
                                        DecreasingAmountCalculationService decreasingAmountCalculationService
    ) {
        this.constantAmountCalculationService = constantAmountCalculationService;
        this.decreasingAmountCalculationService = decreasingAmountCalculationService;
    }
}
