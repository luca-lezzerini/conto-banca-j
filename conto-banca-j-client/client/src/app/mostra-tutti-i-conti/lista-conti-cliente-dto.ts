import { ContoCorrente } from "../gestione-cc/contoCorrente";
import { ContoDeposito } from "../gestione-cd/contoDeposito";
import { ContoPrestito } from "../gestione-cp/conto-prestito";

export class ListaContiClienteDto {
    listaCC: ContoCorrente[];
    listaCD: ContoDeposito[];
    listaCP: ContoPrestito[];
}

