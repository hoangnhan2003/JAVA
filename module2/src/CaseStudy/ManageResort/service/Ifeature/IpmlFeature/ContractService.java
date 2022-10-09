package CaseStudy.ManageResort.service.Ifeature.IpmlFeature;

import CaseStudy.ManageResort.model.feature.Contract;
import CaseStudy.ManageResort.repository.IBooking.Impl.ContractRepo;
import CaseStudy.ManageResort.service.Ifeature.IFeature;

import java.util.Queue;

public class ContractService implements IFeature {
    ContractRepo contractRepo = new ContractRepo();
    @Override
    public void createNewFeature() {
        contractRepo.add();
    }

    @Override
    public void display() {
        Queue<Contract> contractQueue = contractRepo.getData();
        for(Contract contract : contractQueue){
            System.out.println(contract.display());
        }
    }
}
